# Presentation

Football-Patterns is a Java project showcasing how design patterns are applied in football. It offers practical examples of classic patterns using scenarios from the football world.

# Strategy Pattern

The Strategy design pattern is like a toolbox for solving different problems in similar ways but with different approaches. in the context of football is like having different game strategies for different match situations. Imagine a football team with various game plans, such as attacking aggressively or defending cautiously.

In the Strategy design pattern, each game plan is represented by a strategy. You can choose the strategy that best suits the current match scenario. For instance, if your team is leading and wants to maintain possession of the ball, you might choose a defensive strategy. On the other hand, if your team is trailing and needs to score quickly, you might opt for an aggressive attacking strategy.

Similarly, in our football example, the Strategy design pattern involves defining multiple possible strategies for playing the game. Each strategy is encapsulated in a separate class, such as AttackStrategy and DefenseStrategy. This allows the team to switch strategies dynamically during the game based on the current situation on the field.

In summary, the Strategy design pattern allows football teams to dynamically choose from several predefined game strategies based on the current match circumstances. This flexibility enhances the team's ability to respond effectively to different game situations, ultimately improving their chances of success on the field.

![alt Strategy uml](src/main/resources/strategy/strategy.png)

# Observer Pattern
The Observer pattern is a design pattern that allows an object, called the subject or observable, to maintain a list of its dependents, called observers, and notify them automatically of any state changes, typically by calling a specific method on each observer when the subject's state changes.

Think of it this way: imagine you follow several friends on a social media platform. Whenever one of your friends posts a new update, you automatically receive a notification without your friend having to inform you individually about each post.

In this scenario:

- Your friend on the social media platform is the subject or observable.
- You and other users who follow your friend are the observers.

Every time your friend posts a new update (i.e., the subject's state changes), you and other users who follow your friend automatically receive a notification of the new update without your friend having to individually contact each follower.

# Application in the Example of Football Match Tracking:

Now let's apply this concept to our example of tracking a football match:

- The football match is the subject or observable.
- The spectators using the match tracking application are the observers.

Each time an event occurs during the match, such as a goal scored, a card shown, or a player substitution, the match automatically sends a notification to all spectators of the application, without needing to individually contact each spectator. Each spectator then reacts accordingly, for example, by displaying the information on the screen or sending push notifications.

By using the Observer pattern, our football match tracking application can easily update all its spectators in real-time on the match events, providing an immersive and engaging experience for football fans.

![alt Strategy uml](src/main/resources/observer/observer.png)
