# Spring Notes: IoC, Dependency Injection, @Qualifier, Bean Scopes, and Lifecycle

---

# 📌 1. Introduction to Spring

Spring is a lightweight Java framework used to build enterprise applications. Its main goal is to simplify development by managing object creation and dependencies.

---

# 🔑 2. Inversion of Control (IoC)

## Definition
IoC means the control of object creation is transferred from the developer to the Spring container.

---

## ❌ Without IoC (Tight Coupling)

class Car {
    Engine engine = new Engine(); // tightly coupled
}

---

## ✅ With IoC (Loose Coupling)

class Car {
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
}

Spring creates and injects the Engine object.

---

# 🏗️ 3. Spring IoC Container

Responsible for:
- Creating beans
- Managing lifecycle
- Injecting dependencies

Types:
- BeanFactory (basic)
- ApplicationContext (advanced, commonly used)

---

# 🌱 4. What is a Bean?

A bean is a Java object managed by Spring.

---

# 🔗 5. Dependency Injection (DI)

DI is a design pattern where dependencies are provided to a class instead of being created inside it.

---

## Types of DI

1. Constructor Injection (Recommended)
2. Setter Injection
3. Field Injection (Not recommended)

---

# 🎯 6. @Qualifier Annotation

Used when multiple beans of same type exist.

---

# 🧩 7. Bean Scopes

- Singleton (default)
- Prototype
- Request
- Session

---

# 🔄 8. Bean Lifecycle

Create → Inject → Init → Use → Destroy

---

# 🧪 9. Complete Example

(Refer to code in notes)

---

# 🎯 10. Benefits

- Loose coupling
- Better testability
- Cleaner code

---

# 🧠 Summary

IoC + DI simplifies development and improves maintainability.
