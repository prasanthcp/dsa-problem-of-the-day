# DSA Problem of the Day

A structured collection of daily Data Structures and Algorithms (DSA) problem solutions from LeetCode and GeeksforGeeks, implemented in Java with comprehensive JUnit tests. This repository serves as a personal archive for consistent coding practice and skill development.

## 🚀 Features

- **Categorized Solutions**: Problems organized by topic and algorithmic pattern
- **Comprehensive Testing**: Each solution includes unit tests for validation
- **Maven Build System**: Easy dependency management and testing
- **Daily Practice Tracking**: Consistent problem-solving routine

## 📁 Project Structure

```
dsa-problem-of-the-day/
├── src/
│   ├── main/java/
│   │   ├── Arrays/
│   │   │   ├── ChocolateDistribution.java
│   │   │   ├── Prefix/
│   │   │   │   └── MaximumNumberOfOverlappingIntervals.java
│   │   │   ├── SlidingWindow/
│   │   │   │   ├── LongestSubarrayWithAtmostTwoDistinct.java
│   │   │   │   └── LongestSubstringWithKUniques.java
│   │   │   └── Sorting/
│   │   │       └── InversionCount.java
│   │   └── DynamicProgramming/
│   │       ├── _2D/
│   │       │   └── LongestArithmeticSubsequence.java
│   │       └── TwoD/
│   │           └── LongestArithmeticSubsequence.java
│   └── test/java/
│       └── [Corresponding test files]
├── pom.xml
└── README.md
```

## 🛠️ Technologies Used

- **Language**: Java 17
- **Build Tool**: Maven
- **Testing Framework**: JUnit 5
- **Version Control**: Git

## 📋 Topics Covered

- **Arrays**: Basic operations, prefix sums, sorting algorithms
- **Sliding Window**: Efficient subarray/substring problems
- **Dynamic Programming**: 2D DP problems like longest arithmetic subsequences
- **Sorting**: Inversion counting and related algorithms

## 🏃‍♂️ Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6+

### Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/prasanthcp/dsa-problem-of-the-day.git
   cd dsa-problem-of-the-day
   ```

2. Build the project:
   ```bash
   mvn clean compile
   ```

3. Run tests:
   ```bash
   mvn test
   ```

4. Run a specific test:
   ```bash
   mvn test -Dtest=ChocolateDistributionTest
   ```

## 🎯 Problem Sources

- [LeetCode](https://leetcode.com/)
- [GeeksforGeeks](https://www.geeksforgeeks.org/)

## 📈 Goals

- Solve at least one problem daily
- Master various algorithmic techniques
- Build a comprehensive problem-solving toolkit
- Maintain clean, tested, and documented code

## 🤝 Contributing

This is a personal learning repository, but feel free to:
- Suggest improvements
- Report bugs
- Share better solutions

## 📝 Commit Convention

```
[Platform][Topic] Problem Name
```

Examples:
- `[LeetCode][Arrays] Chocolate Distribution`
- `[GFG][Dynamic Programming] Longest Arithmetic Subsequence`

## 📄 License

This project is for educational purposes. Solutions are implemented based on problem statements from respective platforms.