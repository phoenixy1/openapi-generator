/*
OpenAPI Petstore

This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

API version: 1.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package petstore

import (
	"encoding/json"
)

// checks if the HasOnlyReadOnly type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &HasOnlyReadOnly{}

// HasOnlyReadOnly struct for HasOnlyReadOnly
type HasOnlyReadOnly struct {
	Bar *string `json:"bar,omitempty"`
	Foo *string `json:"foo,omitempty"`
}

// NewHasOnlyReadOnly instantiates a new HasOnlyReadOnly object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewHasOnlyReadOnly() *HasOnlyReadOnly {
	this := HasOnlyReadOnly{}
	return &this
}

// NewHasOnlyReadOnlyWithDefaults instantiates a new HasOnlyReadOnly object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewHasOnlyReadOnlyWithDefaults() *HasOnlyReadOnly {
	this := HasOnlyReadOnly{}
	return &this
}

// GetBar returns the Bar field value if set, zero value otherwise.
func (o *HasOnlyReadOnly) GetBar() string {
	if o == nil || IsNil(o.Bar) {
		var ret string
		return ret
	}
	return *o.Bar
}

// GetBarOk returns a tuple with the Bar field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *HasOnlyReadOnly) GetBarOk() (*string, bool) {
	if o == nil || IsNil(o.Bar) {
		return nil, false
	}
	return o.Bar, true
}

// HasBar returns a boolean if a field has been set.
func (o *HasOnlyReadOnly) HasBar() bool {
	if o != nil && !IsNil(o.Bar) {
		return true
	}

	return false
}

// SetBar gets a reference to the given string and assigns it to the Bar field.
func (o *HasOnlyReadOnly) SetBar(v string) {
	o.Bar = &v
}

// GetFoo returns the Foo field value if set, zero value otherwise.
func (o *HasOnlyReadOnly) GetFoo() string {
	if o == nil || IsNil(o.Foo) {
		var ret string
		return ret
	}
	return *o.Foo
}

// GetFooOk returns a tuple with the Foo field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *HasOnlyReadOnly) GetFooOk() (*string, bool) {
	if o == nil || IsNil(o.Foo) {
		return nil, false
	}
	return o.Foo, true
}

// HasFoo returns a boolean if a field has been set.
func (o *HasOnlyReadOnly) HasFoo() bool {
	if o != nil && !IsNil(o.Foo) {
		return true
	}

	return false
}

// SetFoo gets a reference to the given string and assigns it to the Foo field.
func (o *HasOnlyReadOnly) SetFoo(v string) {
	o.Foo = &v
}

func (o HasOnlyReadOnly) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o HasOnlyReadOnly) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Bar) {
		toSerialize["bar"] = o.Bar
	}
	if !IsNil(o.Foo) {
		toSerialize["foo"] = o.Foo
	}
	return toSerialize, nil
}

type NullableHasOnlyReadOnly struct {
	value *HasOnlyReadOnly
	isSet bool
}

func (v NullableHasOnlyReadOnly) Get() *HasOnlyReadOnly {
	return v.value
}

func (v *NullableHasOnlyReadOnly) Set(val *HasOnlyReadOnly) {
	v.value = val
	v.isSet = true
}

func (v NullableHasOnlyReadOnly) IsSet() bool {
	return v.isSet
}

func (v *NullableHasOnlyReadOnly) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableHasOnlyReadOnly(val *HasOnlyReadOnly) *NullableHasOnlyReadOnly {
	return &NullableHasOnlyReadOnly{value: val, isSet: true}
}

func (v NullableHasOnlyReadOnly) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableHasOnlyReadOnly) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


