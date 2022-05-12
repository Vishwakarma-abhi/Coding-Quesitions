n = int(input("Enter the range for the series "));
sum = 0;

for i in range(1,n):
    if i % 2 != 0:
        sum += i;

print("Sum of first ",n,"number is = ",sum);    
