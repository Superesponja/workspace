package br.com.globallabs.springwebmvc.service;

import br.com.globallabs.springwebmvc.excepiton.JediNotFoundException;
import br.com.globallabs.springwebmvc.model.Jedi;
import br.com.globallabs.springwebmvc.repository.JediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JediService {

    @Autowired
    private JediRepository repository;

    public List<Jedi> findAll() {
        return repository.findAll();
    }

    public Jedi findById(Long id) {
        final Optional<Jedi> jedi = repository.findById(id);

        if(jedi.isPresent()) {
            return jedi.get();
        }else{
            throw new JediNotFoundException();
        }
    }

    public Jedi save(Jedi jedi) {
        return repository.save(jedi);
    }

    public void delete(Long id) {
        final Jedi jedi = findById(id);
        repository.delete(jedi);
    }

    public Jedi update(Long id, Jedi dto) {
        final Jedi jedi = findById(id);
        jedi.setName(dto.getName());
        jedi.setLastName(dto.getLastName());
        return jedi;
    }
}
