# ☕ Java Practice

My Java practice programs – basics, input with `Scanner`, inheritance and exception handling.

## 📚 What's Inside

| File | Topic |
|------|-------|
| `helloworld.java` | Hello World |
| `print_scan.java` | Reading input with `Scanner` |
| `evenodd.java` | Even/odd check with `Scanner` and `if/else` |
| `single.java` | Single inheritance (`Animal` → `Dog`) |
| `multi.java` | Multilevel inheritance (`Animal` → `Dog` → `Cat`) |
| `clatop.java` | Superclass/subclass fields and methods (`A` → `B`) |
| `multilevel.java` | One parent, many children (`Dept` → `Student1/2/3`) |
| `Main7.java` | Exception handling – unchecked (`ArithmeticException`), checked (`FileNotFoundException`) and a custom `InsufficientBalanceException` in a bank-account example |
| `clgp.java`, `inheritence.java`, `loanc.java` | Work-in-progress exercises (college classes, inheritance, simple-interest loan calculator) |

## 🛠️ Tech Stack

- Java (JDK 8+)
- VS Code (`.vscode/` launch config)

## 🚀 Run Locally

```bash
git clone https://github.com/shivamani-code/java.git
cd java
java Main7.java          # JDK 11+ runs a single source file directly
```

Or compile first:

```bash
javac multi.java
java multi
```
