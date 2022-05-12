import math
print("Welcome to the Triangle");

print("Lets calculate the area");


side1 = float(input("Enter side 1 "));
side2 = float(input("Enter side  2"));
side3 = float(input("Enter side 3 "));

s = (side1+side2+side3)/3;

area = math.sqrt((s*(s-side1)*(s-side2)*(s -side3)));

print("Area of triangle is = " , area);

