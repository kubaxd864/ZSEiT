import unittest

class TestSplitMethod(unittest.TestCase):
    def test_split_by_default(self):
        self.assertEqual('Jakub Sobczyk'.split(), ['Jakub', 'Sobczyk'])
    
    def test_split_by_znak(self):
        self.assertEqual('Jakub; Sobczyk; klasa; 4TP'.split('; '), ['Jakub', 'Jakub', 'klasa', '4TP'])

if __name__ == '__main__':
    unittest.main()