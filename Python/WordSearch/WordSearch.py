#creating imbedded lists to search
wordes=[]
wordsearch=[]
match=0
file1 = open("Book1.csv","r")
file = file1.readlines()
file2 = open("words.csv","r")
wordSearch = file2.readlines()
for line in file:
  characters=[]
  word=line.rstrip()
  for char in range(len(word)):
    character=[word[char]]
    characters.append(character)
  wordes.append(characters)
for line in wordSearch:
  charact=[]
  line=line.rstrip()
  line=line.replace(",","")
  for char in range(len(line)):
    character=[line[char]]
    charact.append(character)
  wordsearch.append(charact)
word_search=wordsearch
def search():
  for i in range(0,len(wordes)):
    for j in range(0,len(wordes[i])):
      for k in range(0,len(word_search)):
        for l in range(0,len(word_search[k])):
          fmatch=0
          bmatch=0
          vmatch=0
          vbmatch=0
          drmatch=0
          ddrmatch=0
          dlmatch=0
          ddlmatch=0
          if wordes[i][j] == word_search[k][l]:
            #forward horizontal check
            try:
              for b in (range(0,len(wordes[i]))): 
                if wordes[i][j+b]==word_search[k][l+b]:
                  fmatch+=1
              if fmatch==len(wordes[i]):
                for c in (range(0,len(wordes[i]))):
                  wordsearch[k][l+c]=[" "]
            except IndexError:
              pass
            #backward horizontal check
            try:
              for a in (range(0,len(wordes[i]))): 
                if wordes[i][j+a]==word_search[k][l-a]:
                  bmatch+=1
              if bmatch==len(wordes[i]):
                for d in (range(0,len(wordes[i]))):
                  wordsearch[k][l-d]=[" "]
            except IndexError:
              pass
            try:
              for b in (range(0,len(wordes[i]))): 
                if wordes[i][j+b]==word_search[k+b][l]:
                  vmatch+=1
              if vmatch==len(wordes[i]):
                for c in (range(0,len(wordes[i]))):
                  wordsearch[k+c][l]=[" "]
            except IndexError:
              pass
            try:
              for a in (range(0,len(wordes[i]))): 
                if wordes[i][j+a]==word_search[k-a][l]:
                  vbmatch+=1
              if vbmatch==len(wordes[i]):
                for d in (range(0,len(wordes[i]))):
                  wordsearch[k-d][l]=[" "]
            except IndexError:
              pass
            try:
              for b in (range(0,len(wordes[i]))): 
                if wordes[i][j+b]==word_search[k+b][l+b]:
                  drmatch+=1
              if drmatch==len(wordes[i]):
                for c in (range(0,len(wordes[i]))):
                  wordsearch[k+c][l+c]=[" "]
            except IndexError:
              pass
            try:
              for a in (range(0,len(wordes[i]))): 
                if wordes[i][j+a]==word_search[k-a][l-a]:
                  ddlmatch+=1
              if ddlmatch==len(wordes[i]):
                for d in (range(0,len(wordes[i]))):
                  wordsearch[k-d][l-d]=[" "]
            except IndexError:
              pass
            try:
              for b in (range(0,len(wordes[i]))): 
                if wordes[i][j+b]==word_search[k+b][l-b]:
                  dlmatch+=1
              if dlmatch==len(wordes[i]):
                for c in (range(0,len(wordes[i]))):
                  wordsearch[k+c][l-c]=[" "]
            except IndexError:
              pass
            try:
              for a in (range(0,len(wordes[i]))): 
                if wordes[i][j+a]==word_search[k-a][l+a]:
                  ddrmatch+=1
              if ddrmatch==len(wordes[i]):
                for d in (range(0,len(wordes[i]))):
                  wordsearch[k-d][l+d]=[" "]
            except IndexError:
              pass
            for l in range(0,len(word_search[k])):
              drmatch=0
              ddrmatch=0
              dlmatch=0
              ddlmatch=0
              if wordes[i][j] == word_search[k][l]:
                try:
                for b in (range(0,len(wordes[i]))): 
                  if wordes[i][j+b]==word_search[k+b][l+b]:
                    drmatch+=1
                  if drmatch==len(wordes[i]):
                    for c in (range(0,len(wordes[i]))):
                      wordsearch[k+c][l+c]=[" "]
                except IndexError:
                  pass
                try:
                  for a in (range(0,len(wordes[i]))): 
                    if wordes[i][j+a]==word_search[k-a][l-a]:
                      ddlmatch+=1
                  if ddlmatch==len(wordes[i]):
                    for d in (range(0,len(wordes[i]))):
                      wordsearch[k-d][l-d]=[" "]
                except IndexError:
                  pass
                try:
                  for b in (range(0,len(wordes[i]))): 
                    if wordes[i][j+b]==word_search[k+b][l-b]:
                  dlmatch+=1
              if dlmatch==len(wordes[i]):
                for c in (range(0,len(wordes[i]))):
                  wordsearch[k+c][l-c]=[" "]
            except IndexError:
              pass
            try:
              for a in (range(0,len(wordes[i]))): 
                if wordes[i][j+a]==word_search[k-a][l+a]:
                  ddrmatch+=1
              if ddrmatch==len(wordes[i]):
                for d in (range(0,len(wordes[i]))):
                  wordsearch[k-d][l+d]=[" "]
            except IndexError:
              pass

              
            
search()
for list in wordsearch:
  print(list)
