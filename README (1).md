
# CS-320 Portfolio Reflection

## How Can I Ensure That My Code, Program, or Software Is Functional and Secure?
To ensure that my software is functional and secure, I apply disciplined **unit testing** techniques during development. For the ContactService, TaskService, and AppointmentService classes, I implemented JUnit tests that covered not only standard operations but also boundary cases and invalid inputs. This included testing for null values, excessively long strings, invalid IDs, and improper formats. By validating these scenarios through assertions like `assertThrows` and `assertEquals`, I could confirm th...

Additionally, I adopted a **defensive programming mindset**, anticipating ways users could break the system and coding protections against these issues. I prioritized security measures such as validating data constraints, enforcing non-null fields, and avoiding hardcoded assumptions about inputs. My commitment to writing clear, modular, and reusable tests helped build confidence in the quality and reliability of the system.

## How Do I Interpret User Needs and Incorporate Them Into a Program?
Interpreting user needs involves identifying explicit requirements—such as character limits, mandatory fields, and data formats—and implementing those constraints consistently across the program. In ContactService, for example, user needs were reflected in rules like limiting contact ID length to 10 characters and requiring non-null values for key fields.

I consistently used the user's perspective to guide test case development, asking: "What would the user expect?" and "How might a user make mistakes?" Designing tests to validate expected and unexpected behaviors allowed me to align the system closely with user expectations. Understanding the end-user experience helped ensure that the program did not simply meet technical specifications, but also delivered a reliable and intuitive experience.

## How Do I Approach Designing Software?
My software design approach emphasizes **modularity, testability, and maintainability**. I typically begin by identifying the core entities and services required, and I create modular classes that encapsulate specific behaviors or data responsibilities.

Following **test-driven development (TDD)** principles when possible, I use unit tests to inform and validate my implementation choices. I document my methods clearly, avoid redundant logic by using helper functions, and keep each test focused on a single behavior.

I also view testing and design as complementary: by considering how a component should be tested, I often find ways to improve its clarity and structure. I plan for the long-term maintainability of the system, avoiding technical debt through clean coding practices, thorough testing, and thoughtful validation of assumptions.
