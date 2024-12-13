# EcoTransit
I. Brief Project Overview
This project is a Green Transportation Management System, Eco Transit designed to manage a fleet of vehicles, including electric, hybrid, and traditional vehicles, with an emphasis on sustainability. The system allows users to add vehicles, display fleet details, and calculate the total emissions of the fleet. This project utilizes Object-Oriented Programming (OOP) principles mentioned in the Guidelines to organize data and behavior in a way that mirrors real-world vehicle management. This project is basically designed for transportation companies to be able to track their vehicles and their carbon emissions. Promoting going green and helping the environment by tracking their carbon gas emissions promoting an environmental friendly impact through sustainable transportation choices.

By providing detailed insights into the emissions produced by each vehicle, Eco Transit enables transportation companies to make informed decisions about their fleet management, optimize vehicle usage, and transition to cleaner, greener alternatives. The system also supports scheduling, maintenance tracking, and fuel efficiency analysis, ensuring that companies not only reduce their carbon footprint but also improve operational efficiency. In doing so, Eco Transit contributes to a more sustainable and eco-friendly future for the transportation industry.

II. Explanation of How OOP Principles Were Applied
*Encapsulation: Each vehicle has private attributes like model, year and fuelEfficiency. These attributes are accessed and modified through public getter and setter methods, ensuring that the data is securely managed and only exposed when necessary.

*Inheritance: The Vehicle class serves as a base class, and the ElectricVehicle and HybridVehicle classes inherit from it. They reuse properties like model, year, and fuelEfficiencybut extend them with unique properties, like batteryCapacity for electric vehicles and emissionsRate for hybrids.

*Polymorphism: The method calculateCarbonFootprint() is implemented differently for each vehicle type. Electric vehicles return zero emissions, while hybrids calculate their emissions based on their emissionsRate. This allows the same method to have different behaviors depending on the object type.

*Abstraction: The EcoFriendly interface defines a method for calculating carbon footprints, while the details of how it's done are hidden in the ElectricVehicle and HybridVehicle classes. This provides flexibility for adding new vehicle types without changing the core logic.

III. Details of the Chosen SDG and Its Integration into the Project
The Green Transportation Management System aligns with SDG 3 (Good Health and Well-being) by promoting the use of electric and hybrid vehicles, which significantly reduce harmful emissions, improving air quality and benefiting public health. By reducing air pollution, these vehicles contribute to a decrease in respiratory illnesses and cardiovascular diseases, improving overall health in urban environments. The integration of SDG 7 (Affordable and Clean Energy) is reflected in the adoption of electric vehicles that rely on clean energy sources, reducing dependency on fossil fuels. This transition not only helps reduce the carbon footprint of the transportation sector but also promotes the use of sustainable energy solutions, making clean energy more accessible and widespread.

Additionally, this project supports SDG 9 (Industry, Innovation, and Infrastructure) by promoting innovation in transportation infrastructure through the integration of modern, green technologies like electric and hybrid vehicles. These innovations help transform the transport sector into one that is more energy-efficient and sustainable, fostering an eco-friendly ecosystem. By incorporating SDG 11 (Sustainable Cities and Communities), the system supports urban transportation solutions that are cleaner and more efficient, contributing to the development of sustainable cities. Finally, SDG 13 (Climate Action) is directly addressed by reducing greenhouse gas emissions, as electric and hybrid vehicles have lower emissions compared to traditional internal combustion engine vehicles. This transition contributes to global efforts to mitigate climate change and helps companies meet emission reduction targets, ensuring a cleaner, more sustainable future.

IV. Instructions for Running the Program
Navigating the EcoTransit Menu:
After running the program, the system will display a menu where you can interact with the EcoTransit Transportation Management System:
1. Add Electric Vehicle
When you choose Option 1, you will be prompted to enter the details for adding an Electric Vehicle. Here's what happens:
 *It will prompt you to type the model name of the vehicle (e.g., “Tesla Model 3”).
 *You’ll be now then prompted to type the year of the vehicle (e.g., "2023").
 *Next it will promt you to enter the fuel efficiency in terms of kilometers per kilowatt-hour (e.g., “15.2”).
 *Finally, you’ll be prompted to enter the battery capacity of the electric vehicle (e.g., "82" for 82 kWh).
Once you’ve entered these details, the program will add the electric vehicle to the fleet.

2. Add Hybrid Vehicle
When you choose Option 2, you will be prompted to enter the details for adding a Hybrid Vehicle. The steps is the same as Option 1.

3. Display Fleet
If you choose Option 3, the program will display all the vehicles currently in the fleet, showing the model, year, and their respective carbon footprint. If there is currently no vehicles in the fleet, it will show you a prompt that there is no vehicles in the fleet

4. Display Total Emissions
If you choose Option 4, the program will calculate and display the total carbon footprint of all vehicles in the fleet. Again, if there is currently no vehicles in the fleet, it will show a prompt that there is no vehicles in the fleet.

5. Remove a Vehicle
If you choose Option 5, the program will display all the vehicles currently in the fleet, if there is no vei

6. Exit
Choosing Option 5 will exit the program.

Bonus:
Error Handling
If an error occurs (for example, the user enters invalid data), the program will display an error message and return to the main menu. It ensures that the program will not crash.
