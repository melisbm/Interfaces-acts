# Interfícies Java — Activitats

Col·lecció d'activitats per masteritzar les interfícies de Java, organitzades per nivell.

---

## 🟢 Nivell 1 — Fonaments

### 1. Formes Geomètriques
Crea una interfície `Shape` amb el mètode `getArea()`. Implementa-la a les classes `Rectangle`, `Circle` i `Triangle`.

**Conceptes:** `interface`, `implements`, polimorfisme

---

### 2. Animals que parlen
Crea una interfície `Animal` amb el mètode `speak()`. Implementa-la a `Dog`, `Cat` i `Bird` amb sons diferents.

**Conceptes:** `interface`, `@Override`, instanciació

---

### 3. Objectes que volen
Crea una interfície `Flyable` amb el mètode `fly_obj()`. Implementa-la a `Spacecraft`, `Airplane` i `Helicopter`.

**Conceptes:** `interface`, abstracció

---

### 4. Redimensionable
Crea una interfície `Resizable` amb els mètodes `resizeWidth(int)` i `resizeHeight(int)`. Implementa-la a `Rectangle`.

**Conceptes:** paràmetres, `interface`, implementació

---

### 5. CharSequence al revés
Implementa la interfície `java.lang.CharSequence` retornant el text al revés. Inclou `charAt()`, `length()` i `subSequence()`.

**Conceptes:** `CharSequence`, Java stdlib, implementació real

---

## 🟡 Nivell 2 — Intermedi

### 6. Sistema bancari
Crea una interfície `Account` amb els mètodes `deposit()`, `withdraw()`, `calculateInterest()` i `viewBalance()`. Implementa-la a `SavingsAccount` i `CurrentAccount`.

**Conceptes:** herència múltiple, disseny OOP, encapsulació

---

### 7. Múltiples interfícies a Persona
Crea les interfícies `Enraonar`, `Caminar` i `Escriure`. Fes que `Persona extends Animal implements Enraonar, Caminar, Escriure`.

**Conceptes:** `implements` múltiple, herència

---

### 8. Iterator de cartes
Implementa `java.util.Iterator` per recórrer les 13 cartes d'un pal de baralla. El primer `next()` retorna 2, el segon 3... fins a As.

**Conceptes:** `Iterator`, Java stdlib, genèrics

---

### 9. Ordenació polimòrfica
Crea una interfície `Sortable` amb el mètode `sort(int[] array)`. Implementa-la a `QuickSort` i `MergeSort`.

**Conceptes:** algorismes, polimorfisme, arrays

---

### 10. Vehicles: IVehicle
Crea una interfície `IVehicle` amb `drive()` i `refuel(int gasolina)`. Implementa-la a `Car` i `Bicycle`. Analitza quins mètodes comparteixen i quins no.

**Conceptes:** disseny d'interfície, contracte, tipus compatibles

---

### 11. Suma de divisors
Implementa la interfície `AdvancedArithmetic` creant `MyCalculator` amb el mètode `divisor_sum(int n)` que retorna la suma de tots els divisors de `n`.

**Conceptes:** interfícies, matemàtiques

---

## 🔴 Nivell 3 — Avançat

### 12. Interfícies amb `default` methods
Crea una interfície amb `default` methods per a la manipulació de Strings. Comprova com una classe pot sobreescriure'ls o usar-los directament.

**Conceptes:** `default` methods, Java 8+, retrocompatibilitat

---

### 13. Conflicte de `default` methods
Crea dues interfícies amb el mateix `default` method. Fes que una classe les implementi totes dues i resol el conflicte explícitament amb `NomInterfície.super.metode()`.

**Conceptes:** conflicte de diamant, `super`, resolució

---

### 14. Interfícies funcionals i Lambdas
Crea una `@FunctionalInterface` amb un sol mètode abstracte. Usa expressions lambda i method references per instanciar-la.

**Conceptes:** lambda, `@FunctionalInterface`, method reference

---

### 15. Interfícies amb Genèrics
Crea una interfície genèrica `Repository<T>` amb `findById(int)`, `save(T)` i `delete(int)`. Implementa-la per a `User` i `Product`.

**Conceptes:** genèrics, `T`, repository pattern

---

### 16. Callback amb interfície
Implementa un mecanisme de callback: una interfície `OnComplete` que es passa com a paràmetre a un mètode i s'invoca en acabar.

**Conceptes:** callback, event-driven, anonymous class

---

### 17. Filtrat amb `Predicate` i Lambdas
Usa la interfície funcional `Predicate<T>` per filtrar llistes d'objectes. Encadena predicats amb `and()`, `or()` i `negate()`.

**Conceptes:** `Predicate`, `Stream`, lambda chains

---

## ⚡ Reptes teòrics

### 18. Visibilitat de mètodes
Per què el codi següent no compila?
```java
interface X { void methodX(); }
class Y implements X { void methodX() { } }
```
Quina és la regla de visibilitat dels mètodes d'una interfície?

---

### 19. Camps finals a interfícies
Per què el codi següent dóna error?
```java
interface A { int i = 111; }
class B implements A { void m() { i = 222; } }
```
Explica la semàntica dels camps declarats en una interfície.

---

### 20. Taula de compatibilitat de tipus
Donades les classes `Ball`, `Rock`, `Baseball` i `Football`, i la interfície `Tossable`, emplena una taula indicant quin tipus de variable pot guardar quin tipus d'objecte.

---

### 21. Constructors a interfícies
Pot una interfície tenir constructor? Pot tenir camps d'instància? Raona les respostes amb exemples.
