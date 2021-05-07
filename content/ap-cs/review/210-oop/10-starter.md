---
title: "OOP Ex 1" 
date: 2021-05-07T13:03:03-05:00
weight: 10
draft: false
#type: slide
#theme: white
description: "Object-oriented programming review exercises 1."
---

Code fragments for questions:

```java
class A {
  public String f() { return g() + "A"; }
  public String g() { return "X"; }
}
class B extends A {
  public String g() { return "Y"; }
  public String k() { return "Z" + f(); }
}
class C extends B {
  public String f() { return g() + "C"; }
}
```

Given the setup:
```
A a = new A(); A ab = new B(); A ac = new C();
B b = new B(); B bc = new C();
C c = new C();
```

For each line below, either say it is an error or say what String is returned.

1. `a.f();`
2. `ab.k();`
3. `bc.k();`
4. `ac.g();`
<!-- answers
1. "XA"
2. error
3. "ZYC"
4. "Y"
-->

