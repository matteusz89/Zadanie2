Feature: Zakup produktów w sklepie MyStore
  Scenario: Przejscie przez proces zakupu w aplikacji
    Given Uzytkownik znajduje sie na stronie glownej aplikacji
    When Uzytkownik wybiera opcje Sign In
    And Uzytkownik wpisuje poprawny email oraz haslo a nastepnie zatwierdza  dane poprzez klikniecie przycisku zalogowania
    And W polu wyszukiwarki wpisuje Hummingbird Printed Sweater oraz wchodzi na stronę produktu
    And Wybiera rozmiar oraz liczbę sztuk oraz dodaje do koszyka
    Then Przechodzi do platnosci oraz finalizuje ją
    And Zrobi screenshot z potwierdzeniem zamowienia oraz zamknie przegladarke