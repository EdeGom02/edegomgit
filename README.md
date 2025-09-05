# Rastreador de Turno de Trabalho (Work Shift Tracker)

Um aplicativo Android moderno desenvolvido em Kotlin usando Jetpack Compose para rastrear turnos de trabalho através de cartões dinâmicos.

## Características

✨ **Interface Moderna**: Construído com Jetpack Compose e Material Design 3
📱 **Cartões Dinâmicos**: Crie, edite e exclua cartões de forma dinâmica
⚡ **Gerenciamento de Estado**: Usando ViewModel para gerenciamento de estado reativo
🎨 **Design Responsivo**: Interface adaptável com temas claro/escuro
🇧🇷 **Localizado em Português**: Interface completamente em português brasileiro

## Funcionalidades

### Criação de Cartões
- **Título**: Nome do cartão/atividade
- **Valor**: Valor numérico ou texto importante
- **Descrição**: Detalhes adicionais sobre a atividade
- **Timestamp**: Registro automático de data e hora

### Gerenciamento
- ➕ **Adicionar**: Criar novos cartões facilmente
- ✏️ **Editar**: Modificar cartões existentes
- 🗑️ **Excluir**: Remover cartões desnecessários
- 📋 **Visualizar**: Lista organizada de todos os cartões

### Interface
- 🎯 **Estado Vazio**: Interface amigável quando não há cartões
- 🃏 **Cards Elevados**: Design com sombras e bordas arredondadas
- 🔧 **Diálogos Modernos**: Modais para criação/edição
- ⏰ **Formatação de Data**: Exibição clara de timestamps

## Estrutura do Projeto

```
app/src/main/java/com/edegom/workshifttracker/
├── MainActivity.kt              # Atividade principal
├── WorkShiftCard.kt            # Modelo de dados do cartão
├── WorkShiftViewModel.kt       # Gerenciamento de estado
├── WorkShiftScreen.kt          # Interface principal com Compose
└── ui/theme/                   # Temas e estilos
    ├── Color.kt                # Cores do Material Design
    ├── Theme.kt                # Configuração de tema
    └── Type.kt                 # Tipografia
```

## Tecnologias Utilizadas

- **Kotlin**: Linguagem de programação moderna
- **Jetpack Compose**: Framework de UI declarativa
- **Material Design 3**: Sistema de design do Google
- **ViewModel**: Gerenciamento de estado com lifecycle awareness
- **Android Architecture Components**: Componentes de arquitetura modernos

## Como Usar

1. **Iniciar o App**: A tela principal mostra uma lista vazia inicialmente
2. **Adicionar Cartão**: Toque no botão "Adicionar Cartão"
3. **Preencher Dados**: Insira título, valor e descrição
4. **Salvar**: Confirme para criar o cartão
5. **Gerenciar**: Use os ícones de editar/excluir em cada cartão

## Casos de Uso

### Turno de Trabalho
- **Horário de Entrada**: Cartão com hora de início
- **Pausas**: Registrar intervalos e pausas
- **Tarefas Concluídas**: Acompanhar atividades realizadas
- **Horário de Saída**: Registrar fim do turno

### Exemplos de Cartões
- "Entrada": "08:00" - "Início do turno matutino"
- "Almoço": "12:00-13:00" - "Pausa para refeição"
- "Reunião": "14:30" - "Meeting com equipe de desenvolvimento"
- "Saída": "17:00" - "Fim do expediente"

## Vantagens

- ⚡ **Rápido e Leve**: Interface fluida e responsiva
- 🔄 **Atualização em Tempo Real**: Mudanças refletidas instantaneamente
- 💾 **Memória Persistente**: Estados mantidos durante o uso da sessão
- 🎨 **Visual Atrativo**: Design moderno e profissional
- 📱 **Mobile-First**: Otimizado para dispositivos móveis

Este aplicativo fornece uma solução simples e eficiente para rastreamento de atividades durante turnos de trabalho, com uma interface moderna e intuitiva que facilita o uso no dia a dia profissional.