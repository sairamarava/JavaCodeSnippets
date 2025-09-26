# Trees DSA Cheat Sheet (Python)

## Basic Concepts

- **Nodes = N**
- **Levels in a tree:**
  - $\text{levels} = \log_2(N+1)$
- **Number of leaf nodes:**
  - $\text{Num of leaf nodes} = 2^{\log_2(N+1)-1}$

## Power of 2 Check

To check if a number is a power of 2:
```python
import math
num = 16
is_power_of_2 = math.log2(num).is_integer()
print(is_power_of_2)  # True if power of 2
```

## Binary Search Tree (BST) Properties

- `node.left.data < node.data < node.right.data`
- **Leftmost node:** Smallest value
- **Rightmost node:** Largest value
- **Next higher value to root:** Leftmost node of right subtree

## BST Node Deletion

**Delete node with value 20:**
```python
# If key < root.data: go to root.left
# Else: go to root.right
# If node to be deleted is left child of parent: parent.left = None
# Else: parent.right = None
```

**Delete root node:**
- Find the node whose value is just higher than root (inorder successor)
- Replace root with it

**General Deletion Steps:**
1. Node to be deleted is left child of parent and has left child
2. Node to be deleted is right child of parent
3. Node has two children
4. Node has no children

**Find child (kid) address of current node:**
```python
if curr.left is not None:
    kid = curr.left
else:
    kid = curr.right
if parent.left == curr:
    parent.left = kid
else:
    parent.right = kid
```

## Height of a Tree

```python
def height(root):
    if root is None:
        return 0
    return 1 + max(height(root.left), height(root.right))
```

---

## Common Operations in Python

### Node Definition
```python
class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None
```

### Insert in BST
```python
def insert(root, key):
    if root is None:
        return Node(key)
    if key < root.data:
        root.left = insert(root.left, key)
    else:
        root.right = insert(root.right, key)
    return root
```

### Search in BST
```python
def search(root, key):
    if root is None or root.data == key:
        return root
    if key < root.data:
        return search(root.left, key)
    else:
        return search(root.right, key)
```

### Inorder Traversal
```python
def inorder(root):
    if root:
        inorder(root.left)
        print(root.data, end=' ')
        inorder(root.right)
```

### Find Minimum/Maximum
```python
def find_min(root):
    while root.left:
        root = root.left
    return root.data

def find_max(root):
    while root.right:
        root = root.right
    return root.data
```

### Delete Node in BST
```python
def delete_node(root, key):
    if root is None:
        return root
    if key < root.data:
        root.left = delete_node(root.left, key)
    elif key > root.data:
        root.right = delete_node(root.right, key)
    else:
        # Node with only one child or no child
        if root.left is None:
            return root.right
        elif root.right is None:
            return root.left
        # Node with two children: Get inorder successor
        temp = find_min_node(root.right)
        root.data = temp.data
        root.right = delete_node(root.right, temp.data)
    return root

def find_min_node(node):
    current = node
    while current.left:
        current = current.left
    return current
```

---

## Useful Formulas
- **Levels:** $\log_2(N+1)$
- **Leaf nodes:** $2^{\log_2(N+1)-1}$
- **Height:** Recursive max of left/right subtree

---

## Quick Reference
- Use `math.log2(num).is_integer()` to check power of 2
- BST properties: left < root < right
- Inorder successor: leftmost node of right subtree
- Deletion: handle 0, 1, or 2 children cases
- Height: recursive function

---

*This cheat sheet covers essential tree DSA concepts and Python code snippets for quick reference.*
