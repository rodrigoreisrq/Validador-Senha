# ValidadorSenha

Classe Java que valida uma senha com base em regras de segurança e confirma se a senha digitada corresponde à confirmação.

Desenvolvida como exercício de lógica, decomposição de problemas e manipulação de caracteres em Java.

---

## Regras de negócio

| Regra | Detalhe |
|---|---|
| Tamanho mínimo | A senha deve ter no mínimo 8 caracteres |
| Letra maiúscula | Deve conter pelo menos 1 letra maiúscula |
| Letra minúscula | Deve conter pelo menos 1 letra minúscula |
| Número | Deve conter pelo menos 1 dígito numérico |
| Sem espaços | A senha não pode conter espaços |
| Confirmação | A confirmação deve ser idêntica à senha informada |

Cada regra violada retorna uma mensagem específica — não um erro genérico.

---

## Como usar

```java
ValidadorSenha validador = new ValidadorSenha();

System.out.println(validador.digitarSenha("abc"));
// → "A senha deve conter 8 caracteres."

System.out.println(validador.digitarSenha("abcdefgh"));
// → "A senha deve conter um caractere maiúsculo"

System.out.println(validador.digitarSenha("Abcdefgh"));
// → "A senha deve conter um número"

System.out.println(validador.digitarSenha("Abcdefg1"));
// → "Abcdefg1" (senha válida)

System.out.println(validador.confirmacaoDeSenha("Abcdefg1"));
// → "Senha correta."

System.out.println(validador.confirmacaoDeSenha("outrasenha"));
// → "A confirmação de senha está diferente da senha"
```

---

## Estrutura

```
ValidadorDeSenha/
├── src/
│   ├── ValidadorSenha.java
│   └── Main.java
```

---

## Tecnologias

- Java 17+
- Sem dependências externas

---

## Aprendizados

Projeto desenvolvido com foco em:

- Uso de `boolean` para rastrear condições dentro de loops
- Percorrer `char[]` com `toCharArray()` e `Character` utilitário
- Separar responsabilidades entre validação e confirmação
- Retornar mensagens específicas por regra violada em vez de erros genéricos
- Definir a ordem correta das validações antes de codificar
