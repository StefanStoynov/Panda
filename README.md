# Panda
Simple JavaEE project
<hr>


<b>PANDA</b> (Package Acceptance and National Delivery Application) is a platform for package deliveries, which is a fast-<br>
rising Start-Up, which lacks a web application. You have been employed by the KFC (Kung-Fu-Chicken) Corporation<br>
 to implement a web platform for PANDA. <br>
 
<h2>Database - 3 entity application</h2>
<h2>Functional Requirements:</h2>
<pre>The application should provide Guest (not logged in) users with the functionality to:</pre><br>
<ul>
<li>Login</li>
<li>Register</li>
<li>View the Guest Index page</li>
</ul><br>
<pre>The application should provide Users (logged in) with the functionality to:</pre><br>
<ul>
<li>Logout</li>
<li>View their Packages</li>
<li>View details about a Package</li>
<li>View their Receipts</li>
<li>View details about a Receipt</li>
</ul><br>
<pre>The application should provide Admins (logged in, with role - Admin) with the functionality to:</pre><br>
<ul>
<li>Logout</li>
<li>View their Packages</li>
<li>View details about a Package</li>
<li>View their Receipts</li>
<li>View details about a Receipt</li>
<li>View all Pending Packages</li>
<li>View all Shipped Packages</li>
<li>View all Delivered Packages</li>
<li>View details about all Delivered Packages</li>
<li>Ship Packages</li>
<li>Deliver Packages</li>
</ul><br>
<h2>Users</h2><br>
<p>The first registered User should be assigned a role – "Admin". Every User after that, should have a role – "User".<br>
Users have Packages, which are created and controlled for them, by an Administrator. <br>
Users can view Details about their own Packages. <br>
When a Package is delivered, a User can acquire it, at which point a Receipt is created with that Package and that User. <br>
Users can view their Receipts, and details about each Receipt.<br>
Administrators (role = "Admin") are essentially like normal Users. They can also have Packages, which are delivered, acquired and they also have Receipts.<br>
Administrators can also create Packages for a specific User. <br>
</p>
<ul>
<li>They can also view all Pending Packages, and they can Ship them.</li>
<li>They can also view all Shipped Packages, and they can Deliver them.</li>
<li>They can also view all Delivered Packages, and they can view Details about them.</li>
</ul><br>
<h2>Packages</h2><br>
<p>
When Packages are created, they are created with a Description, a Weight, a Shipping Address and a Recipient User. 
</p>
<ul>
<li>Upon creation, the Status of a Package should be set to Pending.</li>
<li>Upon creation, the Estimated Delivery Date of a Package should be set to NULL.</li>
</ul><br>

<h2>Functionality</h2><br>
<h3>Pending Packages</h3>
<p>
A Pending Package, can be Shipped by an Administrator, by clicking on the [Ship] button from the Pending <br>
Packages Page. At that moment the Package Status becomes "Shipped" and the Estimated Delivery Date<br>
 is to be set to a random of 20-40 days from then.
</p>
<ul>
<li>All Pending Packages are presented on the Pending Packages Page.</li>
<li>A User can view his Pending Packages on his Index Page in the Pending rectangular block.</li>
<li>A User can view details about each one of his Pending Packages from his Index Page, by clicking on the [Details] button.</li>
</ul><br>
<h3>Shipped Packages</h3>
<p>
A Shipped Package, can be Delivered by an Administrator, by clicking on the [Deliver] button from the<br>
 Shipped Packages Page. At that moment the Package Status becomes "Delivered".
</p>
<ul>
<li>All Shipped Packages are presented on the Shipped Packages Page.</li>
<li>A User can view his Shipped Packages on his Index Page in the Shipped rectangular block.</li>
<li>A User can view details about each one of his Shipped Packages from his Index Page, by clicking on the [Details] button.</li>
</ul><br>

<h3>Delivered Packages</h3>
<p>
A Delivered Package, can be Acquired by the Package’s Recipient, by clicking on the [Acquire]<br>
button from his Index Page. At that moment the Package Status becomes "Acquired" and a Receipt<br>
is generated to the User for that Package.
</p>
<ul>
<li>All Delivered Packages are presented on the Delivered Packages Page.</li>
<li>A User can view his Delivered Packages on his Index Page in the Delivered rectangular block.</li>
<li>A User can Acquire each one of his Delivered Packages from his Index Page, by clicking on the [Acquire] button.</li>
</ul><br>

<h2>Receipts</h2>
<p>Receipts are just data entities. They are created when a Package is Acquired by its Recipient User. <br>
A Receipt should be created with a Package and a Recipient User.<br>
Upon creation, a Receipt’s Fee should be set to the Package’s Weight multiplied (*) by 2.67.<br>
Upon creation, a Receipt’s IssuedOn should be set to the current moment.<br>
</p>

<h2>Security Requirements</h2>
<p>The Security Requirements are mainly access requirements. Configurations<br>
about which users can access specific functionalities and pages.
</p>
<ul>
<li>Guest (not logged in) users can access Index page and functionality.</li>
<li>Guest (not logged in) users can access Login page and functionality.</li>
<li>Guest (not logged in) users can access Register page and functionality.</li>
<li>Users (logged in) can access User LoggedIn Index page and functionality.</li>
<li>Users (logged in) can access User Package Details page and functionality.</li>
<li>Users (logged in) can access User Receipts page and functionality.</li>
<li>Users (logged in) can access User Receipt Details page and functionality.</li>
<li>Users (logged in) can access User Package Acquire functionality.</li>
<li>Users (logged in) can access Logout functionality.</li>
<li>Admins (logged in) can access every functionality a normal logged in User can.</li>
<li>Admins (logged in) can access Admin LoggedIn Index page and functionality.</li>
<li>Admins (logged in) can access the Admin Package Create page and functionality.</li>
<li>Admins (logged in) can access the Admin Pending Packages page and functionality.</li>
<li>Admins (logged in) can access the Admin Shipped Packages page and functionality.</li>
<li>Admins (logged in) can access the Admin Delivered Packages page and functionality.</li>
<li>Admins (logged in) can access the Admin Package Ship functionality.</li>
<li>Admins (logged in) can access the Admin Package Deliver functionality.</li>
</ul>

