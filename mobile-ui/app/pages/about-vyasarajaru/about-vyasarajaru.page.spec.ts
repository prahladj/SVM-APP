import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AboutVyasarajaruPage } from './about-vyasarajaru.page';

describe('AboutVyasarajaruPage', () => {
  let component: AboutVyasarajaruPage;
  let fixture: ComponentFixture<AboutVyasarajaruPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AboutVyasarajaruPage ],
      schemas: [CUSTOM_ELEMENTS_SCHEMA],
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AboutVyasarajaruPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
