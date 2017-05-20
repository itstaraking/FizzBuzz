# This program identifies numbers divisible by 3 and 5 and identifies them accordingly

# define the main method
def main():
    # call fizzbuzz method
    FizzBuzz();


# define the fizzbuzz method
def FizzBuzz():
    # for loop to print numbers and identify multiples
    for num in range(1,101):
        # if statement to make decision to identify multiples
        if num % 5 == 0 and num % 3 == 0:
            print('FizzBuzz');
        elif num % 3 == 0:
            print('Fizz');
        elif num % 5 == 0:
            print('Buzz');
        else:
            print (num);

# call main method
main();




