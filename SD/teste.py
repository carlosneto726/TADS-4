from random import randint

numeros = []

for n in range(0,10):
    numeros.append(randint(0,10))


maior = menor = numeros[0]
for a in range(0,10):
    if a < menor:
        menor = a

    if a > maior:
        maior = a

print(maior, menor)