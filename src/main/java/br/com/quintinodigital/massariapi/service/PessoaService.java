package br.com.quintinodigital.massariapi.service;

import br.com.quintinodigital.massariapi.entity.PessoaEntity;

import java.util.ArrayList;
import java.util.List;

public class PessoaService implements PessoaInterfaceService {

    private static List<PessoaEntity> pessoaEntityList = new ArrayList<>();
    private static Long interador = 1L;

    @Override
    public PessoaEntity saveOne(PessoaEntity pessoaEntity) {
        pessoaEntity.setCodigo(interador++);
        PessoaEntity pessoa = new PessoaEntity(pessoaEntity);
        this.pessoaEntityList.add(pessoa);
        return pessoa;
    }

    @Override
    public List<PessoaEntity> findAll() {
        return this.pessoaEntityList;
    }

    @Override
    public PessoaEntity updateOne(PessoaEntity pessoaEntity) {
        PessoaEntity pessoa = new PessoaEntity();
        for(PessoaEntity pessoaResultado : this.pessoaEntityList) {
            if(pessoaResultado.getCodigo().equals(pessoaEntity.getCodigo())) {
                pessoaResultado.setNome(pessoaEntity.getNome());
                pessoa = pessoaResultado;
            }
        }
//        this.pessoaEntityList = this.pessoaEntityList.stream().map(p -> p.getCodigo().equals(pessoaEntity.getCodigo()) ? pessoaEntity : p ).collect(Collectors.toList());
        return pessoa;
    }

    @Override
    public void deleteOne(Long codigo) {
        pessoaEntityList.removeIf(p -> p.getCodigo().equals(codigo));
    }

}
