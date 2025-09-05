package com.edegom.workshifttracker

/**
 * Demonstração de uso do aplicativo Work Shift Tracker
 * Este arquivo mostra exemplos de como usar a aplicação para rastrear turnos de trabalho
 */

// Exemplo de uso típico do aplicativo
fun demonstrateWorkShiftTracking() {
    
    // Simulação de um turno de trabalho completo
    val workShiftExamples = listOf(
        WorkShiftCard(
            title = "Entrada",
            value = "08:00",
            description = "Início do turno matutino - Check-in no sistema"
        ),
        
        WorkShiftCard(
            title = "Reunião Diária",
            value = "08:30",
            description = "Daily standup com a equipe de desenvolvimento"
        ),
        
        WorkShiftCard(
            title = "Desenvolvimento",
            value = "3.5 horas",
            description = "Implementação da nova funcionalidade de cartões dinâmicos"
        ),
        
        WorkShiftCard(
            title = "Pausa para Café",
            value = "10:15-10:30",
            description = "Intervalo de 15 minutos"
        ),
        
        WorkShiftCard(
            title = "Code Review",
            value = "2 PRs",
            description = "Revisão de pull requests da equipe"
        ),
        
        WorkShiftCard(
            title = "Almoço",
            value = "12:00-13:00",
            description = "Pausa para refeição"
        ),
        
        WorkShiftCard(
            title = "Reunião Cliente",
            value = "14:00",
            description = "Apresentação do protótipo para stakeholders"
        ),
        
        WorkShiftCard(
            title = "Testes",
            value = "1.5 horas",
            description = "Execução de testes unitários e de integração"
        ),
        
        WorkShiftCard(
            title = "Documentação",
            value = "45 min",
            description = "Atualização da documentação técnica"
        ),
        
        WorkShiftCard(
            title = "Saída",
            value = "17:00",
            description = "Fim do expediente - Check-out do sistema"
        )
    )
    
    // Exemplos de diferentes tipos de rastreamento
    val alternativeExamples = listOf(
        
        // Para enfermeiros
        WorkShiftCard(
            title = "Plantão Noturno",
            value = "22:00",
            description = "Início do turno noturno na UTI"
        ),
        
        // Para motoristas
        WorkShiftCard(
            title = "Entrega Centro",
            value = "Rota 15",
            description = "Entrega de medicamentos no centro da cidade"
        ),
        
        // Para professores
        WorkShiftCard(
            title = "Aula 3º Ano",
            value = "45 min",
            description = "Matemática - Geometria Analítica"
        ),
        
        // Para vendedores
        WorkShiftCard(
            title = "Cliente Premium",
            value = "R$ 2.500",
            description = "Venda de pacote completo para empresa ABC"
        ),
        
        // Para seguranças
        WorkShiftCard(
            title = "Ronda Noturna",
            value = "2ª verificação",
            description = "Inspeção dos portões e câmeras - Tudo OK"
        )
    )
}

/**
 * Casos de uso específicos demonstrando a flexibilidade do app
 */
object UseCaseExamples {
    
    // Caso 1: Profissional de TI
    val itProfessionalShift = listOf(
        "Entrada" to "08:00" to "Check-in remoto",
        "Sprint Planning" to "2 horas" to "Planejamento da sprint 15",
        "Desenvolvimento" to "4 tasks" to "Implementação de features críticas",
        "Deploy" to "Produção" to "Release v2.1.3 - Sucesso",
        "Suporte" to "3 tickets" to "Resolução de bugs reportados",
        "Saída" to "18:00" to "Overtime para entrega do projeto"
    )
    
    // Caso 2: Profissional de Saúde
    val healthcareShift = listOf(
        "Plantão" to "06:00" to "Início do turno matutino",
        "Rounds" to "15 pacientes" to "Visita médica nos quartos",
        "Cirurgia" to "3 horas" to "Procedimento de emergência",
        "Consultas" to "8 atendimentos" to "Consultas ambulatoriais",
        "Documentação" to "45 min" to "Atualização de prontuários",
        "Fim Plantão" to "18:00" to "Passagem de caso para turno noturno"
    )
    
    // Caso 3: Educador
    val teacherShift = listOf(
        "Chegada" to "07:00" to "Preparação das aulas do dia",
        "1ª Aula" to "50 min" to "História - Revolução Industrial",
        "2ª Aula" to "50 min" to "Geografia - Clima Brasileiro",
        "Recreio" to "20 min" to "Supervisão do pátio",
        "3ª Aula" to "50 min" to "História - República Velha",
        "Coordenação" to "1 hora" to "Reunião pedagógica",
        "Saída" to "12:00" to "Fim do turno matutino"
    )
}

/**
 * Demonstração de funcionalidades da interface
 */
object UIFeatureDemo {
    
    // Estados da aplicação
    val emptyState = "Quando não há cartões, mostra mensagem amigável"
    val loadedState = "Lista de cartões organizados cronologicamente"
    val addDialog = "Modal para adicionar novo cartão"
    val editDialog = "Modal para editar cartão existente"
    
    // Ações disponíveis
    val actions = mapOf(
        "Adicionar" to "Botão principal para criar novos cartões",
        "Editar" to "Ícone em cada cartão para modificar dados",
        "Excluir" to "Ícone em cada cartão para remover",
        "Cancelar" to "Fechar diálogos sem salvar",
        "Salvar" to "Confirmar criação/edição de cartões"
    )
    
    // Validações implementadas
    val validations = mapOf(
        "Título obrigatório" to "Campo não pode estar vazio",
        "Valor obrigatório" to "Campo não pode estar vazio", 
        "Descrição opcional" to "Campo pode estar vazio",
        "Botão salvar" to "Só fica ativo com campos válidos"
    )
}

/**
 * Benefícios do aplicativo para diferentes profissões
 */
object ProfessionalBenefits {
    
    val generalBenefits = listOf(
        "Rastreamento preciso de atividades",
        "Histórico visual de tarefas realizadas",
        "Organização temporal do trabalho",
        "Facilita prestação de contas",
        "Melhora produtividade e foco",
        "Interface simples e intuitiva"
    )
    
    val specificBenefits = mapOf(
        "Desenvolvedores" to listOf(
            "Controle de tempo por feature",
            "Rastreamento de bugs resolvidos",
            "Histórico de deployments",
            "Métricas de produtividade"
        ),
        
        "Profissionais Saúde" to listOf(
            "Controle de plantões",
            "Registro de procedimentos",
            "Quantidade de atendimentos",
            "Cumprimento de protocolos"
        ),
        
        "Educadores" to listOf(
            "Controle de aulas ministradas",
            "Registro de atividades extras",
            "Acompanhamento de turmas",
            "Gestão do tempo pedagógico"
        ),
        
        "Vendedores" to listOf(
            "Controle de visitas",
            "Registro de vendas",
            "Acompanhamento de metas",
            "Histórico de clientes"
        )
    )
}

// Exemplo de fluxo completo de uso
fun completeDemoFlow() {
    println("=== DEMO: Work Shift Tracker ===")
    println()
    
    println("1. Usuário abre o aplicativo")
    println("   → Tela vazia com botão 'Adicionar Cartão'")
    println()
    
    println("2. Usuário toca em 'Adicionar Cartão'")
    println("   → Modal de criação aparece")
    println("   → Campos: Título, Valor, Descrição")
    println()
    
    println("3. Usuário preenche primeiro cartão:")
    println("   Título: 'Entrada'")
    println("   Valor: '08:00'") 
    println("   Descrição: 'Início do turno'")
    println("   → Toca em 'Salvar'")
    println()
    
    println("4. Cartão aparece na lista principal")
    println("   → Mostra título, valor, descrição e timestamp")
    println("   → Ícones de editar e excluir visíveis")
    println()
    
    println("5. Usuário adiciona mais cartões durante o dia")
    println("   → Lista cresce cronologicamente")
    println("   → Interface permanece responsiva")
    println()
    
    println("6. Final do dia: histórico completo disponível")
    println("   → Visão clara de todas as atividades")
    println("   → Facilita relatórios e controles")
    println()
    
    println("=== FIM DA DEMONSTRAÇÃO ===")
}

/**
 * Este arquivo demonstra a versatilidade e utilidade do aplicativo
 * Work Shift Tracker para diferentes tipos de profissionais e situações.
 * 
 * O app oferece uma solução simples mas poderosa para rastreamento
 * de atividades durante turnos de trabalho, com interface moderna
 * e funcionalidades intuitivas.
 */