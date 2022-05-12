year = int(input("Enter the Year to check leap or not  "));

if year % 4 ==0:
    if year % 100 != 0:
        print("Leap year");
elif year % 400 == 0:
    print("leap year");
else:
    print("Not a leap year");
