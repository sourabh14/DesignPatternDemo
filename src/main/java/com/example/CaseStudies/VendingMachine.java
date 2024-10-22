package com.example.CaseStudies;

public class VendingMachine {
    /*
        Vending machine

            Description:
                A vending machine is an automated machine that dispenses items such as food or drinks. A user can
                make payment and the machine will dispense the selected item through designated slot.

            System requirements:
                Functional
                    - Admin must be able to add/remove items and their inventory
                    - A user must be able to view the available items
                    - A port is display area operated by the user to add money and order items
                    - The vending machine can contain multiple ports
                    - The user should be able to add money through port
                    - The user must be able to select multiple items based on their id
                    - Money cannot be withdrawn from vending machine once it is credited
                    - The user should be given an error or a warning if the available balance is less than item ordered

                Non-functional
                    - System must be able to handle failures gracefully
                    - System must be able to scale
                    - System must be able to handle concurrent requests

            System interface:
                - items CRUD: Admin
                - Add/Remove inventory of items: Admin
                - Get all available items along with their price, where inventory is greater than one: User
                - Add balance (UPI transaction): User
                - Get current balance: User
                - Order item: User

            classDiagram
                class VendingMachine {
                    -id
                    -code
                    -amount
                    -itemCodeToItem
                    +addAmount()
                    +createOrder()
                }

                class Item {
                    -id
                    -code
                    -price
                    -inventory
                    -inventoryLedger
                    +updateInventory()
                    +updateInventoryLedger()
                }

                class InventoryLedger {
                    -id
                    -quantity
                    -note
                    -created
                    -updated
                }

                class Order {
                    -id
                    -code
                    -item
                    -quantity
                    -status
                    -created
                }

                class OrderStatus {
                    <<enumeration>>
                    CREATED
                    COMPLETE
                }

                VendingMachine o-- Item
                Item --> InventoryLedger
                Order --> Item
                Order --> OrderStatus

     */
}
