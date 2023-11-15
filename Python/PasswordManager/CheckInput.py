class CheckInput:
 
    @staticmethod
    #check input function
    def getCorrectInput(userInput,listOfAnswers,question):
        while not (userInput in listOfAnswers):
            userInput = input(question)
        return userInput
