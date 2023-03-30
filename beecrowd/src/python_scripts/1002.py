#1002
def area(raio):
  pi = float(3.14159)
  return pi * (raio * raio)

raio = float(input())

print("A=%0.4f"%area(raio))