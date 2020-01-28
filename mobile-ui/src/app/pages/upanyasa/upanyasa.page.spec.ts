import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpanyasaPage } from './upanyasa.page';

describe('UpanyasaPage', () => {
  let component: UpanyasaPage;
  let fixture: ComponentFixture<UpanyasaPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpanyasaPage ],
      schemas: [CUSTOM_ELEMENTS_SCHEMA],
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpanyasaPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
