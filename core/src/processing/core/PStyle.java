/* -*- mode: java; c-basic-offset: 2; indent-tabs-mode: nil -*- */

/*
  Part of the Processing project - http://processing.org

  Copyright (c) 2012-21 The Processing Foundation
  Copyright (c) 2006-12 Ben Fry and Casey Reas
  Copyright (c) 2004-06 Michael Chang

  This library is free software; you can redistribute it and/or
  modify it under the terms of the GNU Lesser General Public
  License version 2.1 as published by the Free Software Foundation.

  This library is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
  Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General
  Public License along with this library; if not, write to the
  Free Software Foundation, Inc., 59 Temple Place, Suite 330,
  Boston, MA  02111-1307  USA
*/

package processing.core;


public class PStyle implements PConstants {
  public int imageMode;
  public int rectMode;
  public int ellipseMode;
  public int shapeMode;

  public int blendMode;

  public int colorMode;
  public float colorModeX;
  public float colorModeY;
  public float colorModeZ;
  public float colorModeA;

  public boolean tint;
  public int tintColor;
  public boolean fill;
  public int fillColor;
  public boolean stroke;
  public int strokeColor;
  public float strokeWeight;
  public int strokeCap;
  public int strokeJoin;

  // TODO these fellas are inconsistent, and may need to go elsewhere
  public float ambientR, ambientG, ambientB;
  public float specularR, specularG, specularB;
  public float emissiveR, emissiveG, emissiveB;
  public float shininess;

  public PFont textFont;
  public int textAlign;
  public int textAlignY;
  public int textMode;
  public float textSize;
  public float textLeading;
}
