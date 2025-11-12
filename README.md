Objetivo: O objetivo desta aplicação é fazer o gerenciamento de agenda dos profissionais e o armazenamento dos prontuários 
médicos. Neste projeto não haverá login ou genrenciamento de sessão.

Classes:
    CRUD 
        - Interface com métodos de CRUD

    Pessoas
        - Profissional
        - Paciente
    
    Agendamento
        - Vínculo com profissional
        - Vínculo com paciente


    Consulta
        - Vínculo com profissional
        - Vínculo com paciente
        - Vínculo com Agendamento

Especificação das classes
    Classe pessoa:
        id
        nome
        cpf
        telefone
        email
        endereco

    Classe profissional:
        especialidade
        registro_profissional (CRM, CRO, etc.)
        horarios_disponiveis

    Classe paciente:
        data_nascimento
        sexo
        historico_medico

    Classe agendamento
        id,
        profissional (referência ao objeto Profissional)
        paciente (referência ao objeto Paciente)
        data_hora
        status (Agendado, Cancelado, Realizado)
        observacoes

    Classe prontuário:
        id
        profissional
        paciente
        agendamento (chave estrangeira)
        data_hora
        descricao
        diagnostico
        prescricao
        anexos

Funcionalidade importantes
    Controle de Disponibilidade
        - Funcionalidade que verifica se o profissional tem disponibilidade na agenda.
