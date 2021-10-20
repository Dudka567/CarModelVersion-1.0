cd C:\Program Files\Java\jdk-11.0.10\bin
set DIR_PROJECT=C:\Users\dselenkin\Desktop\CarModel\MyPack\
del /s %DIR_BIN%\*.class >NUL
javac C:\Users\dselenkin\Desktop\CarModel\MyPack\*.java 
java C:\Users\dselenkin\Desktop\CarModel\MyPack\CarModelling.java