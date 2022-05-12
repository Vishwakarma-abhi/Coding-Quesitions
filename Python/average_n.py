n = int(input("Enter the range for the series "));
sum = 0;

for i in range(1,n):
    sum += i;
avg = sum/n;
print("Average of first ",n,"number is = ",avg);    
