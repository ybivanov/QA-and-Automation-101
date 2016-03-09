#!/usr/bin/env python

import unittest

def create_file(content):
  data_file = open('./test.txt', 'a+')
  data_file.write(content)
  data_file.close()


class TestFlakiness(unittest.TestCase):
    def test_create_file(self):
        create_file("Hello World")
        self.assertEqual(open('./test.txt').read(), "Hello World")

if __name__ == "__main__":
    unittest.main()
