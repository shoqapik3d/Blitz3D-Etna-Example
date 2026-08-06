; Etna library, by Progi1984 and RepeatUntil
; License:
; This library is an "email-ware". This means that this library is free. However, if you use this library
; in one of your project, you MUST contact the authors saying that you are using Etna. An email is required
; whatever is the status of the project: commercial or non-commercial, completed or in development. Even if
; the project is just starting, is just private or will never be released, you are still required to send an
; email. Needless to say, your email won't be use except for the authors to do a count of their users.
; If you wish, you could describe your project in your email, and we can even include a link to your project
; on this web page if you authorize us.
; To contact the authors: progi1984@free.fr, repeatuntil@free.fr or the Etna forum.


; Constants for the state (ETNA_GetState)
Const ETNA_OK = 2
Const ETNA_NO_NETWORK = 3
Const ETNA_CONNECTION_FAILED = 4
Const ETNA_REQUEST_ERROR = 5
Const ETNA_SYSTEM_ERROR = 6
; To run without thread for a special command
Const ETNA_NO_THREAD = -999   

; Redefine some functions to get default arguments

; Function doing nothing for BlitzBasic (but used for BlitzMax and PureBasic) 
Function ETNA_Initialise()
  Return True
End Function

Function ETNA_GetResult$(Line% = -1)
  Return ETNA__GetResult(Line)
End Function

Function ETNA_Send(ID%, command$, encrypted% = False, highPriority% = False)
  ETNA__Send(ID%, command$, encrypted%, highPriority%)
End Function