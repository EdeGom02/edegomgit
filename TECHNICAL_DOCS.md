# Documentação Técnica - Work Shift Tracker

## Arquitetura da Aplicação

### Padrão MVVM (Model-View-ViewModel)

#### Model (WorkShiftCard.kt)
```kotlin
data class WorkShiftCard(
    val id: String = UUID.randomUUID().toString(),
    val title: String,
    val value: String,
    val description: String,
    val timestamp: Long = System.currentTimeMillis()
)
```

**Características:**
- Identificador único gerado automaticamente
- Timestamp automático para rastreamento temporal
- Estrutura imutável com data class
- Campos obrigatórios para título e valor

#### ViewModel (WorkShiftViewModel.kt)
```kotlin
class WorkShiftViewModel : ViewModel() {
    private val _cards = mutableStateListOf<WorkShiftCard>()
    val cards: List<WorkShiftCard> = _cards

    fun addCard(card: WorkShiftCard)
    fun updateCard(updatedCard: WorkShiftCard)
    fun deleteCard(cardId: String)
}
```

**Funcionalidades:**
- Gerenciamento de estado reativo
- Lista mutável observável
- Operações CRUD completas
- Sobrevive a mudanças de configuração

#### View (WorkShiftScreen.kt)
Interface construída com Jetpack Compose seguindo princípios de UI declarativa.

## Componentes da Interface

### 1. WorkShiftScreen
Composable principal que gerencia o estado geral da tela.

**Estados:**
- Lista de cartões
- Diálogo de adição
- Diálogo de edição

### 2. WorkShiftCardItem
Composable para renderizar cada cartão individual.

**Elementos:**
- Header com título e ações
- Corpo com valor e descrição
- Footer com timestamp formatado

### 3. AddEditCardDialog
Modal para criação e edição de cartões.

**Campos:**
- Título (obrigatório)
- Valor (obrigatório)
- Descrição (opcional)

### 4. EmptyState
Tela de estado vazio quando não há cartões.

## Gerenciamento de Estado

### Estado Local vs ViewModel

**Estado Local (remember):**
- Visibilidade de diálogos
- Campos de entrada de texto
- Estados temporários da UI

**ViewModel:**
- Lista de cartões
- Lógica de negócio
- Estados que sobrevivem a reconfigurações

### Reatividade

O app usa `mutableStateListOf` para garantir que mudanças na lista de cartões sejam automaticamente refletidas na UI através do sistema de recomposição do Compose.

## Tema e Design

### Material Design 3
```kotlin
@Composable
fun WorkShiftTrackerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
)
```

**Características:**
- Suporte a tema claro/escuro
- Cores dinâmicas (Android 12+)
- Tipografia consistente
- Componentes Material 3

### Cores
```kotlin
val Purple80 = Color(0xFFD0BCFF)  // Tema escuro
val Purple40 = Color(0xFF6650a4)  // Tema claro
```

## Formatação e Localização

### Timestamp
```kotlin
private fun formatTimestamp(timestamp: Long): String {
    val formatter = SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.getDefault())
    return formatter.format(Date(timestamp))
}
```

### Strings Localizadas
Todos os textos estão em `strings.xml` para facilitar futuras traduções:
- Títulos e botões
- Mensagens de estado
- Labels de campos

## Validação

### Regras de Negócio
- Título e valor são obrigatórios
- Descrição é opcional
- ID é gerado automaticamente
- Timestamp é automático

### Validação na UI
```kotlin
enabled = title.isNotBlank() && value.isNotBlank()
```

## Boas Práticas Implementadas

### 1. Separação de Responsabilidades
- Model: Apenas dados
- ViewModel: Lógica de negócio
- View: Apenas UI

### 2. Estado Imutável
- Data classes imutáveis
- Operações que retornam novas instâncias

### 3. Composables Pequenos e Focados
- Cada composable tem uma responsabilidade específica
- Facilita reutilização e teste

### 4. Gerenciamento de Recursos
- Uso correto de remember para estados locais
- ViewModel para estados que sobrevivem

### 5. Acessibilidade
- Content descriptions para ícones
- Estrutura semântica clara

## Expansões Futuras

### Persistência
- Room Database para armazenamento local
- Backup na nuvem

### Funcionalidades Avançadas
- Categorias de cartões
- Filtros e pesquisa
- Relatórios de tempo

### Melhorias de UX
- Animações de transição
- Gestos personalizados
- Notificações

### Sincronização
- Backup automático
- Sincronização entre dispositivos
- API REST para dados compartilhados

## Configuração do Projeto

### Dependências Principais
```gradle
// Compose
implementation platform('androidx.compose:compose-bom:2023.05.01')
implementation 'androidx.compose.ui:ui'
implementation 'androidx.compose.material3:material3'

// ViewModel
implementation 'androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1'

// Activity
implementation 'androidx.activity:activity-compose:1.7.2'
```

### Configuração do Build
- Kotlin 1.8.10
- Android Gradle Plugin 7.4.2
- Compile SDK 32
- Min SDK 24 (Android 7.0+)

Esta arquitetura garante um aplicativo moderno, escalável e maintível, seguindo as melhores práticas de desenvolvimento Android com Kotlin e Jetpack Compose.