# Smart Mini-Ledger (The Bytex Challenge)

A clean, production-ready full-stack mini-ledger application built seamlessly using Java, Spring Boot, Spring Data JPA, and MySQL.

## 🚨 The Unique Human Twist: Anomaly Alert Logic
To elevate this beyond simple CRUD operations, I implemented an automated **Internal Anomaly & High-Value Expense Alert System** within the backend controller layer. If a transaction object is registered as an `EXPENSE` and its absolute value matches or exceeds **INR 10,000**, the controller immediately triggers an internal high-priority alert routine. This demonstrates proactive backend validation and logging architecture.

## 🧠 AI Co-pilot Reflection (Where Human Judgment Intervened)
During the initial project construction phase, standard AI assistance provided boilerplate configurations that contained critical structural discrepancies:
1. **Strict Metadata Configuration Conflicts:** The automated generator suggested cutting-edge Spring Boot 4.1.0 with a non-standard Java version configuration, which resulted in strict XML validation parser faults (`cvc-elt.1.a`) directly in the `pom.xml`. Recognizing this compilation blocker, I applied manual architectural experience to safely downgrade the stack to a stable, industrial-grade **Spring Boot 3.3.0 and Java 17** ecosystem.
2. **Undefined Internal Scope & Compilation States:** The initial code structure missed out on the explicit synchronization of persistence mapping states inside the data entity model, rendering standard getter/setter properties inaccessible to the controller layer. I caught the undefined type safety error manually and realigned the entity data model fields correctly.
