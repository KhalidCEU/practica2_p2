## Practica 1 - Programación 2

### Explicación / Teoría

El método usado para obtener la aproximación del numero PI, es el método **Monte-Carlo**.

Estos son los pasos que usamos para generar el una aproximación del número PI **de manera iterativa**:

- Se genera un punto **aleatorio** en un cuadrado **de lado 1** (con ```Math.random```).
- **Verificamos** si el punto esta **dentro de un círculo** de radio 1 (situado en parte dentro del cuadrado)
- **Contamos** los puntos que caen **dentro del círculo**.
- Usamos la **proporción de puntos dentro del círculo respecto al total** para aproximar PI.

<div align="center">
    <img src="https://github.com/user-attachments/assets/d7daf124-b33e-460c-b1d1-29bb39ec308a" style="width: 50%">
</div>

La formula usada para la generación del numero PI es la siguiente:

> **PI ≈ 4 * (puntos dentro del círculo) / (total puntos generados)**

Esto tambien significa que cuanto mas puntos (parametro **"pasos"**) generamos, mas nos aproximaremos al numero PI.

### Uso

Primero compile el programa con el comando :

```
make
```

Lance el programa :

```
./a.out <numeroDePasos>
```

### Output

```
// Input : 1000000000

El número PI es 3.141555912
```

> Nota: Con numeros grandes, la ejecución puede tardar un poco mas en finalizar, ya que el numero de iteraciones es mayor.
