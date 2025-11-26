package com.uno.unoclin.patient.service;


import com.uno.unoclin.entity.repository.EntityRepository;
import com.uno.unoclin.entity.service.EntityBaseService;
import com.uno.unoclin.patient.domain.Patient;
import org.springframework.stereotype.Service;

@Service
public class PatientService extends EntityBaseService<Patient> {

    public PatientService(EntityRepository<Patient> repository) {
        super(repository);
    }


    @Override
    public void beforeSave(Patient patient) {

        String cpf = formatCpf(patient.getCpf());

        patient.setCpf(cpf);

    }

    // feito por IA, pois não sabia como fazer um na mão.
    // Ele primeiramente vai deixar apenas números na string
    // Depois ele separar por grupo e reuni-los conforme os grupos de números
    public static String formatCpf(String cpf) {
        cpf = cpf.replaceAll("\\D", "");

        return cpf.replaceFirst("(\\d{3})(\\d{3})(\\d{3})(\\d{2})",
                "$1.$2.$3-$4");
    }
}
