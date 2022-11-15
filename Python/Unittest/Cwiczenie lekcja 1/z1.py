import unittest

class TestUpper(unittest.TestCase):
    def test_upper(self):
        self.assertEqual("imie".upper(), "IMIE")
    
    def test_is_upper(self):
        self.assertTrue('IMIE'.isupper())
        self.assertFalse('imie'.isupper())

if __name__ == '__main__':
    unittest.main()
