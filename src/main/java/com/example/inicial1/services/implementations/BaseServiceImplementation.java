package com.example.inicial1.services.implementations;

import com.example.inicial1.entities.BaseEntity;
import com.example.inicial1.repositories.BaseRepository;
import com.example.inicial1.services.BaseService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
public abstract class BaseServiceImplementation<E extends BaseEntity, ID extends Serializable> implements BaseService<E, ID> {

    protected BaseRepository<E, ID> baseRepository;

    public BaseServiceImplementation(BaseRepository<E, ID> baseRepository){
        this.baseRepository = baseRepository;
    }

    @Override
    @Transactional
    public List<E> findAll() throws Exception {
        try {
            return baseRepository.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E findById(ID id) throws Exception {
        try {
            Optional<E> entityOptional = baseRepository.findById(id);
            if (entityOptional.isPresent()) {
                return entityOptional.get();
            } else {
                throw new Exception("No se encontró ningún "+ this.getClass().getSimpleName() + " con id:" + id);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try {
            return baseRepository.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(ID id, E entity) throws Exception {
        try {
            Optional<E> entityOptional = baseRepository.findById(id);
            if (entityOptional.isPresent()) {
                E entityUpdate = entityOptional.get();
                entityUpdate = baseRepository.save(entity);
                return entityUpdate;
            } else {
                throw new Exception(this.getClass().getSimpleName() + " no encontrado. ");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try {
            Optional<E> entityOptional = baseRepository.findById(id);
            if (entityOptional.isPresent()) {
                baseRepository.deleteById(id);
                return true;
            } else {
                throw new Exception(this.getClass().getSimpleName() + " no encontrado. ");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
