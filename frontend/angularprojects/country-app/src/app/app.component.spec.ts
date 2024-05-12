import { TestBed } from '@angular/core/testing';
import { AppComponent } from './app.component'; // Import AppComponent instead of AppModule

describe('AppComponent', () => {
  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [
        AppComponent // Declare AppComponent here
      ],
    }).compileComponents();
  });

  it('should create the app', () => {
    const fixture = TestBed.createComponent(AppComponent); // Create component from AppComponent
    const app = fixture.componentInstance;
    expect(app).toBeTruthy();
  });

  it(`should have the 'Your App Name' title`, () => {
    const fixture = TestBed.createComponent(AppComponent); // Create component from AppComponent
    const app = fixture.componentInstance;
    expect(app.title).toEqual('Your App Name');
  });

  it('should render title', () => {
    const fixture = TestBed.createComponent(AppComponent); // Create component from AppComponent
    fixture.detectChanges();
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.querySelector('h1')?.textContent).toContain('Hello, Your App Name');
  });
});
