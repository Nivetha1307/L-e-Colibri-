<html>
    <head>
        <title>
            Le Colibri -- Catered Services
        </title>
        <link rel="stylesheet" href="catered-services.css">
    </head>
    <body>
        <div class="navigation-bar">
            <ul>
                <li><a href="homepage.html">Home</a></li>
                <li><a href="menu.html">Menu</a></li>
                <li><a href="#">Order Online</a></li>
                <li><a href="#">Reserve Your Table</a></li>
                <li><a href="#">Food Gallery</a></li>
                <li><a href="catered-services.html">Catering Inquiry</a></li>
                <li><a href="#">Feedback</a></li>
                <li><a href="our-story.html">Our Story</a></li>
                <li><a href="#">Staff Portal</a></li>
            </ul>
        </div>

        <div class="form-div">
            <h1>Catering Services</h1>
            <h3>
                This form is intended for large-size catering requests of $250 or more in value. If otherwise, just give us a call at (Phone Number) or order directly on our website.
            </h3>
            <form action="catering_register" method="post">
                <p>Name*</p>
                <input type="text" class="first-name" placeholder="First Name">
                <input type="text" class="last-name" placeholder="Last Name">
                <br>
                <p>Phone Number*</p>
                <span>+91</span>
                <input type="text" class="phone-number" maxlength="10">
                <br>
                <p>Email*</p>
                <input type="email" class="email" placeholder="Email Address">
                <br>
                <p>Your Proposed Order*</p>
                <textarea class="order"></textarea>
                <br>
                <p>Proposed Number of guests</p>
                <input type="number" class="guests">
                <br>
                <p>Date on which the order is needed</p>
                <input type="text" class="date" placeholder="DD" maxlength="2">
                <input type="text" class="month" placeholder="MM" maxlength="2">
                <input type="text" class="year" placeholder="YYYY" maxlength="4">
                <br>
                <p>Time at which the order is needed</p>
                <input type="text" class="hour" placeholder="HH" maxlength="2">
                <input type="text" class="minute" placeholder="MM" maxlength="2">
                <select class="am-pm">
                    <option>AM</option>
                    <option>PM</option>
                </select>
                <br>
                <p>Pick-up or Delivery*</p>
                <select class="pickup-delivery">
                    <option>Delivery</option>
                    <option>Pick-up</option>
                </select>
                <br>
                <p>Delivery Address</p>
                <span>If applicable</span>
                <br>
                <input type="text" class="address-1" placeholder="Address Line 1"><br>
                <br>
                <input type="text" class="address-2" placeholder="Address Line 2"><br>
                <br>
                <input type="text" class="city" placeholder="City">
                <input type="text" class="state" placeholder="State"><br>
                <br>
                <input type="text" class="zipcode" placeholder="Zip Code" maxlength="6"><br>
                <br>
                <input type="text" class="country" placeholder="Country"><br>
                <br>

                <button type="submit">Send</button>
            </form> 
        </div>

        <div class="footer">
            <div class="footer-order">
             <button type="submit">Order Now!</button>
            </div>
            <div class="footer-address">
             <p>3000, Oscarp Avenue<br>Westview, NJ</p>
            </div>
            <div class="footer-contact">
             <a href="mailto:abc@gmail.com">abc@gmail.com</a><br>
             <p>(Phone number)</p>
            </div>
            <div class="footer-timing">
             <p><b>Hours</b>
                 <br>Mon: 8am —10pm<br>
                 Tue: 8am —1pm<br>
                 Wed: 8am —10pm<br>
                 Thur: 8am —10pm <br>
                 Fri: 8am —10pm<br>
                 Sat: 12pm —10pm<br>
                 Sun: 12pm —10pm</p>
            </div>
    </body>
</html>