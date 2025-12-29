package lesson30

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class InventoryManagerTest {

    @Test
    fun `getItemCount returns 0 for missing item`() {
        val manager = InventoryManager(10)
        assertEquals(0, manager.getItemCount("apple"))
    }

    @Test
    fun `addItem adds new item`() {
        val manager = InventoryManager(10)
        manager.addItem("apple", 3)
        assertEquals(3, manager.getItemCount("apple"))
    }

    @Test
    fun `addItem increases existing item`() {
        val manager = InventoryManager(10)
        manager.addItem("apple", 3)
        manager.addItem("apple", 2)
        assertEquals(5, manager.getItemCount("apple"))
    }

    @Test
    fun `addItem throws exception when capacity exceeded`() {
        val manager = InventoryManager(5)
        manager.addItem("apple", 3)

        assertThrows<IllegalStateException> {
            manager.addItem("banana", 3)
        }
    }

    @Test
    fun `removeItem removes exact quantity`() {
        val manager = InventoryManager(10)
        manager.addItem("apple", 5)

        val result = manager.removeItem("apple", 5)

        assertTrue(result)
        assertEquals(0, manager.getItemCount("apple"))
    }

    @Test
    fun `removeItem reduces quantity`() {
        val manager = InventoryManager(10)
        manager.addItem("apple", 5)

        val result = manager.removeItem("apple", 3)

        assertTrue(result)
        assertEquals(2, manager.getItemCount("apple"))
    }

    @Test
    fun `removeItem returns false if item does not exist`() {
        val manager = InventoryManager(10)

        val result = manager.removeItem("apple", 1)

        assertFalse(result)
    }

    @Test
    fun `removeItem returns false if not enough quantity`() {
        val manager = InventoryManager(10)
        manager.addItem("apple", 2)

        val result = manager.removeItem("apple", 3)

        assertFalse(result)
        assertEquals(2, manager.getItemCount("apple"))
    }

    @Test
    fun `removeItem does not affect other items`() {
        val manager = InventoryManager(10)
        manager.addItem("apple", 3)
        manager.addItem("banana", 4)

        manager.removeItem("apple", 1)

        assertEquals(2, manager.getItemCount("apple"))
        assertEquals(4, manager.getItemCount("banana"))
    }

    @Test
    fun `addItem with zero throws exception`() {
        val manager = InventoryManager(10)

        assertThrows<IllegalArgumentException> {
            manager.addItem("apple", 0)
        }
    }

    @Test
    fun `removeItem with zero throws exception`() {
        val manager = InventoryManager(10)
        manager.addItem("apple", 3)

        assertThrows<IllegalArgumentException> {
            manager.removeItem("apple", 0)
        }
    }

    @Test
    fun `capacity counts all items`() {
        val manager = InventoryManager(6)
        manager.addItem("apple", 3)
        manager.addItem("banana", 3)

        assertThrows<IllegalStateException> {
            manager.addItem("orange", 1)
        }
    }

    @Test
    fun `removing item frees capacity`() {
        val manager = InventoryManager(5)
        manager.addItem("apple", 5)

        manager.removeItem("apple", 2)
        manager.addItem("banana", 2)

        assertEquals(3, manager.getItemCount("apple"))
        assertEquals(2, manager.getItemCount("banana"))
    }

    @Test
    fun `multiple operations keep correct state`() {
        val manager = InventoryManager(10)

        manager.addItem("apple", 3)
        manager.addItem("banana", 2)
        manager.removeItem("apple", 1)
        manager.addItem("orange", 4)

        assertEquals(2, manager.getItemCount("apple"))
        assertEquals(2, manager.getItemCount("banana"))
        assertEquals(4, manager.getItemCount("orange"))
    }
}
