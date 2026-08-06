Include "./Etna_inc.bb"

ETNA_Initialise()
ETNA_SetServer("http://localhost/B3D_Net/")

player$ = Input("Select a player name : ")
coins = Int(Input("Select an amount : "))

ETNA_Send(ETNA_NO_THREAD, "index.php?opt=save&player=" + player$ + "&coins=" + coins)

If ETNA_GetState() = ETNA_OK Then
    Print "Result = " + ETNA_GetResult()

    For i = 1 To ETNA_GetNbOfLines()
        Print ETNA_GetResult(i)
    Next
Else
    Print "Error : " + ETNA_GetState()
EndIf
End