import unittest

def calculate_tax(sallary,tax,age):    
    if age<18:      return int(min(sallary*tax, 5000))
    elif age<65:    return int(sallary*tax)
    else:           return int(min(sallary*tax, 8000))

class TaxTest(unittest.TestCase):
   def test_calculate_tax(self):
        self.table = [10,18,20,40,65,67]
        for i in self.table:
            if i<18:    self.assertEqual(calculate_tax(60000,0.15,i), int(min(60000*0.15,5000)))
            elif i<65:  self.assertEqual(calculate_tax(60000,0.15,i), int(60000*0.15))
            else:       self.assertEqual(calculate_tax(60000,0.15,i), int(min(60000*0.15,8000)))

if __name__ == '__main__':
    unittest.main()