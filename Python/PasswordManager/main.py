#imports and defining
import csv
from csv import writer
from CheckPass import CheckPass
from CheckInput import CheckInput
from Account import Account
from PasswordGenerator import PasswordGenerator
loginCounter=0
managerAccountCreate=0
newLoginInfoList=[]
categoryList=[]
ui=""
loginSuccess=0
siteAddLoop=0
categoryOptions=1
categoryAnswersList=[]
newAddedAccountList=[]
siteIndexList=[]
siteEditDeleteList=[]

#running code
print("\nPassword Manager\n-----------------")
ui=CheckInput.getCorrectInput(ui,['n','r'],"Are you a new or returning user? (n,r) ")
#new user addition
if ui=="n":
    ui=""
    while managerAccountCreate!=1:
        #input new username and password
        newUsername=input("New Username: ")
        confirmUsername=input("Confirm Username: ")
        if confirmUsername!=newUsername:
            print("Username confirmation is not the same. Please enter username again.")
        elif confirmUsername==newUsername:
            while managerAccountCreate!=1:
                #input new password and confirm
                newPassword=input("New Password: ")
                confirmPassword=input("Confirm Password: ")
                if confirmPassword!=newPassword:
                    print("Password confirmation is not the same. Please enter Password again.")
                elif confirmPassword==newPassword:
                    while managerAccountCreate!=1:
                        #add hint for new account and ask for confirmation
                        loginHint=input("What would you like to use for a hint in the case of forgetting your password? ")
                        ui=CheckInput.getCorrectInput(ui,['y','n'],loginHint+"\nIs this the hint you want to save? (y,n) ")
                        if ui=="y":
                            ui=""
                            while managerAccountCreate!=1:
                                #add first and last name to new account and ask for confirmation
                                firstName=input("What first name do you want to associate with this account? ").upper()
                                lastName=input("What last name do you want to associate with this account? ").upper()
                                ui=CheckInput.getCorrectInput(ui,['y','n'],firstName+" "+lastName+"\nIs this the name you want to save? (y,n) ")
                                if ui=="y":
                                    ui=""
                                    #add new username, password, hint, and first and last name to list
                                    newLoginInfoList.append(newUsername)
                                    newLoginInfoList.append(newPassword)
                                    newLoginInfoList.append(loginHint)
                                    newLoginInfoList.append(firstName)
                                    newLoginInfoList.append(lastName)
                                    #creates a new csv file to use for database
                                    fileToWriteTo=open(f"{newUsername}_{newPassword}.csv","w",newline='')
                                    #add list to csv file in a new line
                                    with open('loginInfo.csv', 'a') as loginInfo:
                                        writerObject = writer(loginInfo)
                                        writerObject.writerow(newLoginInfoList)
                                        loginInfo.close()
                                    print("Account created successfully!")
                                    newLoginInfoList=[]
                                    managerAccountCreate=1
                                    print("\nCategories\n-----")
                                    inputnum=int(input("How many categories would you like to add to your account?"))
                                    for i in range(inputnum):
                                        categories=input("Category: ")
                                        ui=CheckInput.getCorrectInput(ui,['y','n'],categories+"\nIs this the categories you want to save? (y,n) ")
                                        if ui=="y":
                                            ui=""
                                            categoryList.append(categories)
                                    with open(f"{newUsername}_{newPassword}.csv", 'a') as category:
                                        writerObject = writer(category)
                                        writerObject.writerow(categoryList)
                                        category.close()
                                    ui="r"


managerAccountCreate=0
#existing user login
if ui=="r":
    ui=""
    while loginCounter<4 and loginSuccess==0:
        loginCounter+=1
        if loginCounter==4:
            exit()
        print("\nLogin\n-----")
        #input username and password
        loginUsername=input("Username: ")
        loginPassword=input("Password: ")
        #open file and check for password and username being in the same line
        with open('loginInfo.csv','r') as file:
            loginInfo = csv.reader(file)
            for row in loginInfo:
                if row!=[]:
                    if loginUsername==row[0] and loginPassword==row[1]:
                        print("Login Successful")
                        loginSuccess=1
                        break
        if loginSuccess==0:
            print("Incorrect username or password")
        #ask about hint and input first and last name
        if loginCounter<2 and loginSuccess==0:
            ui=CheckInput.getCorrectInput(ui,['y','n'],"Do you need a hint? (y,n)")
            if ui=="y":
                ui=""
                firstNameHint=input("First name assosiated with the account? ").upper()
                lastNameHint=input("Last name assosiated with the account? ").upper()
                #open file and check for first and last name in same line. Print hint thats in the same line if name lines up
                with open('loginInfo.csv','r') as file:
                    loginInfo = csv.reader(file)
                    for row in loginInfo:
                        if row!=[]:
                            if firstNameHint==row[3] and lastNameHint==row[4]:
                                print("\nHint: "+row[2])
                                break
#running code after login
if loginSuccess==1:
  while ui!="e":
    siteAddLoop=0
    #input for what user wants to do once logged in
    ui=CheckInput.getCorrectInput(ui,['s','c','e'],"Would you like to add a (s)ite, view (c)ategories, or (e)xit? (s,c,e) ")
    if ui=="s":
        ui=""
        #get site name and check for correct input
        while siteAddLoop!=1:
            siteName=input("Site name: ")
            ui=CheckInput.getCorrectInput(ui,['y','n'],siteName+"\nIs this the site name you want to save? (y,n) ")
            if ui=="y":
                ui=""
                #get site username and check for correct input
                while siteAddLoop!=1:
                    siteUsername=input("Site username: ")
                    ui=CheckInput.getCorrectInput(ui,['y','n'],siteUsername+"\nIs this the site username you want to save? (y,n) ")
                    if ui=="y":
                        ui=""
                        #generate or add password and confirm
                        while siteAddLoop!=1:
                            ui=CheckInput.getCorrectInput(ui,['g','a'],"Would you like to (g)enerate a password or (a)dd one yourself? (g,a)")
                            if ui=="g":
                                ui=""
                                sitePassword=PasswordGenerator.newPassword()
                                ui=CheckInput.getCorrectInput(ui,['y','n'],sitePassword+"\nIs this the site password you want to save? (y,n) ")
                            elif ui=="a":
                                ui=""
                                sitePassword=input("Site password: ")
                                # check user password for requirements and confirm
                                correctPassword=CheckPass.checkPassword(sitePassword)
                                if correctPassword==1:
                                    ui=CheckInput.getCorrectInput(ui,['y','n'],sitePassword+"\nIs this the site password you want to save? (y,n) ")
                            if ui=="y":
                                ui=""
                                #open text file to print categories
                                while siteAddLoop!=1:
                                    with open(f"{loginUsername}_{loginPassword}.csv","r") as file:
                                        reader = csv.reader(file)
                                        row1 = next(reader)
                                        for row in row1:
                                            print(f"{categoryOptions}. {row}")
                                            categoryOptions+=1
                                        categoryOptions=1
                                        for x in range(len(row1)):
                                            categoryAnswersList.append(str(categoryOptions))
                                            categoryOptions+=1
                                        #input for category user wants to use
                                        ui=CheckInput.getCorrectInput(ui,categoryAnswersList,"\nWhich category would you like to use?\nOrder Number(Ex: '1', '2', etc): ")
                                        ui=int(ui)-1
                                        siteCategory=row1[ui]
                                        file.close()
                                        categoryOptions=1
                                        categoryAnswersList=[]
                                        ui=""
                                        #print inputed info and ask for confirmation 
                                        Account.printAccount(siteName,siteUsername,sitePassword,siteCategory)
                                        ui=CheckInput.getCorrectInput(ui,['y','n'],"Is all the information correct? (y,n) ")
                                        #add to list to append to csv database
                                        if ui=="y":
                                            ui=""
                                            newAddedAccountList.append(siteName)
                                            newAddedAccountList.append(siteUsername)
                                            newAddedAccountList.append(sitePassword)
                                            newAddedAccountList.append(siteCategory)
                                            with open(f"{loginUsername}_{loginPassword}.csv","a",newline='') as file:
                                                writerObject = writer(file)
                                                writerObject.writerow(newAddedAccountList)
                                                file.close()
                                            print("Account added")
                                            newAddedAccountList=[]
                                            siteAddLoop=1             
    #open user file and print categories                                      
    elif ui=="c":
        ui=""
        print("\nCategories\n----------")
        with open(f"{loginUsername}_{loginPassword}.csv","r") as file:
            reader = csv.reader(file)
            row1 = next(reader)
            for row in row1:
                print(f"{categoryOptions}. {row}")
                categoryOptions+=1
            categoryOptions=1
            for x in range(len(row1)):
                categoryAnswersList.append(str(categoryOptions))
                categoryOptions+=1
            #input for category user wants to view
            ui=CheckInput.getCorrectInput(ui,categoryAnswersList,"Which category would you like to view?\nCategory Number(Ex: '1', '2', etc): ")
            ui=int(ui)-1
            categoryToView=row1[ui]
            file.close()
        categoryOptions=1
        categoryAnswersList=[]
        ui=""
      #print sites that match category the user inputed
        with open(f'{loginUsername}_{loginPassword}.csv','r') as file:
            siteToSelect = csv.reader(file)
            for row in siteToSelect:
                if row!=[]:
                    if len(row)==4:
                        if categoryToView==row[3]:
                            print(f"{categoryOptions}. {row[0]}")
                            siteIndexList.append(row[0])
                            categoryAnswersList.append(str(categoryOptions))
                            categoryOptions+=1
            file.close()
        #input site user would like to view and prints site info in correct format
        ui=CheckInput.getCorrectInput(ui,categoryAnswersList,"Which site would you like to view?\nSite Number(Ex: '1', '2', etc): ")
        ui=int(ui)-1
        siteToView=siteIndexList[ui]
        with open(f'{loginUsername}_{loginPassword}.csv','r') as file:
            siteToSelect = csv.reader(file)
            for row in siteToSelect:
                if row!=[]:
                    if siteToView==row[0]:
                        print(f"Site Name: {row[0]}\n\tUsername: {row[1]}\n\tPassword: {row[2]}\n")
            categoryAnswersList=[]
            categoryOptions=1
            ui=""
        #user input for what the user wants to do after viewing site info
        ui=CheckInput.getCorrectInput(ui,['e','d','b'],"Would you like to (e)dit the password, (d)elete the password, or go (b)ack? (e,d,b) ")
        if ui=="b":
            ui=""
        elif ui=="e":
            ui=""
            #get site name and confirm
            while siteAddLoop!=1:
                siteName=input("Site name: ")
                ui=CheckInput.getCorrectInput(ui,['y','n'],siteName+"\nIs this the site name you want to save? (y,n) ")
                if ui=="y":
                    ui=""
                    #get sit username and confirm
                    while siteAddLoop!=1:
                        siteUsername=input("Site username: ")
                        ui=CheckInput.getCorrectInput(ui,['y','n'],siteUsername+"\nIs this the site username you want to save? (y,n) ")
                        if ui=="y":
                            ui=""
                            #generate or add password and check for correct input
                            while siteAddLoop!=1:
                                ui=CheckInput.getCorrectInput(ui,['g','a'],"Would you like to (g)enerate a password or (a)dd one yourself? (g,a)")
                                if ui=="g":
                                    ui=""
                                    sitePassword=PasswordGenerator.newPassword()
                                    ui=CheckInput.getCorrectInput(ui,['y','n'],sitePassword+"\nIs this the site password you want to save? (y,n) ")
                                elif ui=="a":
                                    ui=""
                                    sitePassword=input("Site password: ")
                                    # check user password for requirements and confirm
                                    correctPassword=CheckPass.checkPassword(sitePassword)
                                    if correctPassword==1:
                                        ui=CheckInput.getCorrectInput(ui,['y','n'],sitePassword+"\nIs this the site password you want to save? (y,n) ")
                                if ui=="y":
                                    ui=""
                                    #open text file to print categories
                                    while siteAddLoop!=1:
                                        with open(f"{loginUsername}_{loginPassword}.csv","r") as file:
                                            reader = csv.reader(file)
                                            row1 = next(reader)
                                            for row in row1:
                                                print(f"{categoryOptions}. {row}")
                                                categoryOptions+=1
                                            categoryOptions=1
                                            for x in range(len(row1)):
                                                categoryAnswersList.append(str(categoryOptions))
                                                categoryOptions+=1
                                            #input for category user wants to use
                                            ui=CheckInput.getCorrectInput(ui,categoryAnswersList,"\nWhich category would you like to use?\nOrder Number(Ex: '1', '2', etc): ")
                                            ui=int(ui)-1
                                            siteCategory=row1[ui]
                                            file.close()
                                            categoryOptions=1
                                            categoryAnswersList=[]
                                            ui=""
                                            #print inputed info and ask for confirmation 
                                            Account.printAccount(siteName,siteUsername,sitePassword,siteCategory)
                                            ui=CheckInput.getCorrectInput(ui,['y','n'],"Is all the information correct? (y,n) ")
                                            #add to list to append to csv database
                                            if ui=="y":
                                                ui=""
                                                siteEditDeleteList.append(siteName)
                                                siteEditDeleteList.append(siteUsername)
                                                siteEditDeleteList.append(sitePassword)
                                                siteEditDeleteList.append(siteCategory)
                                                with open(f"{loginUsername}_{loginPassword}.csv","a",newline='') as file:
                                                    writerObject = writer(file)
                                                    writerObject.writerow(siteEditDeleteList)
                                                    file.close()
                                                #
                                                #delete line that had previous information goes here
                                                #
                                                print("Account edited")
                                                siteEditDeleteList=[]
                                                siteAddLoop=1
#delete and delete part of editing
#we couldn't figure out how to do this without deleting all of the text in the csv file
        # elif ui=="d":
        #    with open(f'{loginUsername}_{loginPassword}.csv','r') as inp, open(f'{loginUsername}_{loginPassword}.csv','w') as out:
        #          writerObject = csv.writer(out)
        #          readerObject = csv.reader(inp)
        #          for row in inp:
        #              if siteToView==row[0]:
        #                   row.replace(siteToView,[])
        #                   out.close()
            # with open(f'{loginUsername}_{loginPassword}.csv') as inf:
            #     reader = csv.reader(inf.readlines())
            # with open(f'{loginUsername}_{loginPassword}.csv', 'w') as outf:
            #     writer = csv.writer(outf)
            #     for line in reader:
            #         if siteToView==row[0]:
            #             writer.writerow(siteEditDeleteList)
            #             break
        
        #exit program
        elif ui=="e":
          exit()
