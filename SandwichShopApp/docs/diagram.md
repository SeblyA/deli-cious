# 🥪 DELI-CIOUS Sandwich Shop  diagram Plan

| Real-world thing | Class  Name  | Properties                | Methods                   |
|------------------|--------------|---------------------------|---------------------------|
| A sandwich       | `Sandwich`   | size, bread, meat, cheese | getPrice()                |
| A drink          | `Drink`      | size, flavor              | getPrice(), getSummary()  |
| A bag of chips   | `ChipsOrder` | flavor, quantity          | getPrice(), getSummary()  |
| A full order     | `Order`      | List~MenuItem~            | addItem(), printReceipt() |
| Base item        | `MenuItem`   | name                      | getPrice(), getSummary()  |
classDiagram
class Priceable {
<<interface>>
+getPrice() double
}

    class MenuItem {
        <<abstract>>
        #String name
        +getName() String
        +getPrice() double
        +getSummary() String
    }

    class UserInterface {
        -int choice
        -List~String~ toppings
        -List~String~ sauces
        -List~String~ sides
        +StartMenu() void
        +header() void
        +homeScreen() void
        +orderScreen() void
        +breadScreen() void
        +meatScreen() void
        +cheeseScreen() void
        +toppingsScreen() void
        +sauceScreen() void
        +drinkScreen() void
        +chipsScreen() void
        +checkout() void
        +pause() void
    }

    class Sandwich {
        -SandwichSize size
        -BreadType bread
        -MeatType meat
        -boolean extraMeat
        -CheeseType cheese
        -boolean extraCheese
        -List~String~ toppings
        -List~String~ sauces
        +getPrice() double
        +getSummary() String
    }

    class Drink {
        -DrinkSize size
        -DrinkFlavor flavor
        +getPrice() double
        +getSummary() String
    }

    class ChipsOrder {
        -Chips flavor
        -int quantity
        +getPrice() double
        +getSummary() String
    }

    class Order {
        -List~MenuItem~ items
        +addItem(MenuItem) void
        +removeItem(MenuItem) void
        +getTotal() double
        +printReceipt() void
    }

    class SandwichSize {
        <<enumeration>>
        FOUR_INCH
        EIGHT_INCH
        TWELVE_INCH
        -int inches
        -double price
        -double meat
        -double extraMeat
        -double cheese
        -double extraCheese
        +getInches() int
        +getPrice() double
        +getMeat() double
        +getExtraMeat() double
        +getCheese() double
        +getExtraCheese() double
    }

    class BreadType {
        <<enumeration>>
        WHITE
        WHEAT
        RYE
        WRAP
        -String displayOption
        +getDisplayOption() String
        +toString() String
    }

    class DrinkSize {
        <<enumeration>>
        SMALL
        MEDIUM
        LARGE
        -String size
        -double price
        +getSize() String
        +getPrice() double
    }

    class DrinkFlavor {
        <<enumeration>>
        COKE
        LEMONADE
        SWEET_TEA
        ROOT_BEER
    }

    class Chips {
        <<enumeration>>
        ORIGINAL
        BARBECUE
        RANCH
        -String flavor
        -double price
        +getFlavor() String
        +getPrice() double
    }

    Priceable <|.. MenuItem
    MenuItem <|-- Sandwich
    MenuItem <|-- Drink
    MenuItem <|-- ChipsOrder
    Order --> MenuItem
    Sandwich --> SandwichSize
    Sandwich --> BreadType
    Drink --> DrinkSize
    Drink --> DrinkFlavor
    ChipsOrder --> Chips
    UserInterface --> Order
