# Carro - Padrão Composite

Projeto desenvolvido para a disciplina de Programação Orientada a Objetos (POO), aplicando o padrão de projeto estrutural **Composite** para modelar a hierarquia e calcular o peso total de um automóvel.

---

## 📌 Diagrama de Classes

```text
                     +---------------------------------------+
                     |             <<interface>>             |
                     |            ComponenteCarro            |
                     +---------------------------------------+
                     | + getNome(): String                   |
                     | + somarPesos(total: double): double   |
                     +---------------------------------------+
                                  ^             ^
                                 /               \
                                /                 \
  +-------------------------------------+   +---------------------------------------+
  |                Peca                 |   |             ParteComposta             |
  +-------------------------------------+   +---------------------------------------+
  | - nome: String                      |   | - nome: String                        |
  | - peso: double                      |   | - partes: List<ComponenteCarro>       |
  +-------------------------------------+   +---------------------------------------+
  | + Peca(nome: String, peso: double)  |   | + adicionar(parte: ComponenteCarro)   |
  | + getNome(): String                 |   | + remover(parte: ComponenteCarro)     |
  | + getPeso(): double                 |   | + getPartes(): List<ComponenteCarro>  |
  | + somarPesos(total: double): double |   | + getNome(): String                   |
  +-------------------------------------+   | + somarPesos(total: double): double   |
                                            +---------------------------------------+
                                                     ^     ^      ^       ^
                                                     |     |      |       |
                 +-----------------+-----------------+     |      +---------------+
                 |                 |                       |                      |
         +---------------+ +---------------+        +--------------+        +-------------+
         |     Carro     | |     Chassi    |        |  Carroceria  |        | TremDeForca |
         +---------------+ +---------------+        +--------------+        +-------------+
         | + Carro()     | | + Chassi()    |        | + Carroceria()|       | +TremDeForca()|
         | + calcular... | +---------------+        +--------------+        +-------------+
         +---------------+
```

---

## 🌳 Hierarquia de Composição

```text
Carro (Composite)
├── Carroceria (Composite)
│   ├── Para-lamas (Leaf)
│   ├── Portas (Leaf)
│   ├── Painéis (Leaf)
│   ├── Porta-malas (Leaf)
│   └── Capô (Leaf)
└── Chassi (Composite)
    ├── Trem de Força (Composite)
    │   ├── Motor (Leaf)
    │   ├── Transmissão (Leaf)
    │   ├── Diferencial (Leaf)
    │   └── Rodas (Leaf)
    └── Suspensão (Leaf)
```

---

## 🚀 Como Executar

### 1. Compilação
```bash
javac -encoding UTF-8 *.java
```

### 2. Execução
```bash
java Main
```

---

## 💻 Exemplo de Saída

```text
=== Início do cálculo do peso do veículo ===
Somando agora o peso de Para-lamas: 15.20 kg. Total parcial: 15.20 kg
Somando agora o peso de Portas: 42.10 kg. Total parcial: 57.30 kg
Somando agora o peso de Painéis: 18.40 kg. Total parcial: 75.70 kg
Somando agora o peso de Porta-malas: 14.50 kg. Total parcial: 90.20 kg
Somando agora o peso de Capô: 19.80 kg. Total parcial: 110.00 kg
Somando agora o peso de Motor: 210.30 kg. Total parcial: 320.30 kg
Somando agora o peso de Transmissão: 65.40 kg. Total parcial: 385.70 kg
Somando agora o peso de Diferencial: 28.60 kg. Total parcial: 414.30 kg
Somando agora o peso de Rodas: 55.20 kg. Total parcial: 469.50 kg
Somando agora o peso de Suspensão: 48.90 kg. Total parcial: 518.40 kg
============================================
PESO TOTAL DO VEÍCULO: 518.40 kg
```