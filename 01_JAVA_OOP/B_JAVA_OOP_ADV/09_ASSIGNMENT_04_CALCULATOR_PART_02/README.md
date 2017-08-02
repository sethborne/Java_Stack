# Calculator Part II (Optional)

The client has requested a change in spec: they need the calculator to process multiple values, as well as have some more complex abilities. They need the possibility for you to add several numbers in a row: this requires a change in our interface as we can't be sure how many total operands the client will be using. Now they expect this to work:

● performOperation(10.5)

● performOperation("+")

● performOperation(5.2)

● performOperation("*")

● performOperation(10)

● performOperation("=")

● getResults()

where the result would be 62.5. They want to be able to do this for an arbitrary number of numbers, as well as add in the capability to multiply and divide. You can assume that all inputs will be valid. Notice that the calculator must correctly perform the order of operations.

## Topics:

● Classes

● JavaBean

## Tasks:

● Create the Calculator bean that will allow for the user to set operands and operations, then perform them and get the results.

● Have logic for adding, subtracting, dividing, and multiplication.

## Notes:

● You may want to use helper boolean properties to indicate if an operation or operand has been set or used yet.