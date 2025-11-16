INSERT INTO schedule (professional_id, patient_id, start, end_at, status, observation)
VALUES
    (1, 3, '2025-01-10 08:00:00', '2025-01-10 08:30:00', 'CONFIRMED', 'Consulta de rotina'),
    (2, 1, '2025-01-10 09:00:00', '2025-01-10 09:45:00', 'PENDING', 'Primeira consulta do paciente'),
    (3, 4, '2025-01-10 10:00:00', '2025-01-10 10:30:00', 'CANCELLED', 'Cancelado pelo paciente'),
    (1, 2, '2025-01-10 11:00:00', '2025-01-10 11:20:00', 'COMPLETED', 'Retorno, tudo certo'),
    (4, 5, '2025-01-10 14:00:00', '2025-01-10 14:30:00', 'NO_SHOW', 'Paciente não compareceu'),
    (2, 3, '2025-01-11 08:30:00', '2025-01-11 09:00:00', 'CONFIRMED', 'Consulta marcada ontem'),
    (5, 2, '2025-01-11 09:30:00', '2025-01-11 10:00:00', 'PENDING', NULL),
    (3, 1, '2025-01-11 10:15:00', '2025-01-11 10:45:00', 'CONFIRMED', 'Possível alergia'),
    (4, 4, '2025-01-11 13:00:00', '2025-01-11 13:30:00', 'COMPLETED', 'Retorno agendado para 30 dias'),
    (5, 5, '2025-01-11 15:00:00', '2025-01-11 15:30:00', 'CANCELLED', 'Cancelado pelo profissional');
