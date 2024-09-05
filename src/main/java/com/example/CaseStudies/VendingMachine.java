package com.example.CaseStudies;

public class VendingMachine {
    /*
        Vending machine

            Description:
                A vending machine is an automated machine that dispenses items such as food or drinks. A user can insert money and the machine will release items based on the selection.

            System requirements:
                - A user must be able to view the available items
                - The vending machine contains a port where items can be ordered
                - The port can be operated by a single user at a time
                - The user should be able to add/enter money
                - The user must be able to select multiple items based on their id
                - The user should be given an error or a warning if the available balance is less than item ordered

            Users:
                - Admin
                - Users

            Use cases:
                - Add/Get/Update/Delete items in the vending machine: Admin
                - Add/Remove inventory of items: Admin
                - Get all available items along with their price, where inventory is greater than one: User
                - Add balance (UPI transaction): User
                - Get current balance: User
                - Order item: User

            Class diagram:

                VendingMachine
                    - itemToInventory: Map<Item, Inventory>
                    - currentBalance

                    + addBalance(amount): boolean
                    + orderItem(item):

                Item
                    - code
                    - name
                    - price
                    - created
                    - updated

                ItemInventory
                    - itemId
                    - inventory
                    - created
                    - updated

                Transaction
                    - type: AddBalance, OrderItem
                    - price
                    - remainingBalance
                    - created

     */
}
