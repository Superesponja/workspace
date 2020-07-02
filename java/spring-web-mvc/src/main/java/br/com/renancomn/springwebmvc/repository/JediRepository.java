package br.com.renancomn.springwebmvc.repository;

import br.com.renancomn.springwebmvc.model.Jedi;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JediRepository {
    private List<Jedi> allJedi;


    public JediRepository(){
        allJedi = new ArrayList();
        allJedi.add(new Jedi("Luke", "Skywalker"));
    }

    public List<Jedi> getAllJedi(){
        return allJedi;
    }

    public void add(Jedi jedi) {
        this.allJedi.add(jedi);
    }
}
