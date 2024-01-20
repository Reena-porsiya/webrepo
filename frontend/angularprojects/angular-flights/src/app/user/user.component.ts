import { Component } from '@angular/core';
import { User } from '../user';
import { ActivatedRoute, Router } from '@angular/router';
import { UserService } from '../user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent {
  user: User;
  responseMessage: string;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private userService: UserService
  ) {
    this.user = new User();
    this.responseMessage = ''; 
  }

  onSubmit() {
    this.userService.login(this.user).subscribe(
      (response: any) => {
        this.responseMessage = 'User login successful'; 
        console.log('Form submitted:', this.user);
      },
      (error) => {
        this.responseMessage = 'Incorrect username or password'; 
        console.error('Login failed:', error);
      },
      () => this.gotoUserList() 
    );
  }

  gotoUserList() {
   
    this.router.navigate(['/user']);
  }
}
